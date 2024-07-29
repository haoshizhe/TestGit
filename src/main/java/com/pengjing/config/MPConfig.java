package com.pengjing.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//这个配置加上以后，引导类所在包及其子包下的所有配置、包括Bean的定义都会被加载，扫描成功
@Configuration
public class MPConfig {
//    定义拦截器
//    spring是用来管理Bean的,相当于交给spring管理一个Bean（用来mybatis-plus的拦截器（拦截器里面是一个具体的拦截器
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
