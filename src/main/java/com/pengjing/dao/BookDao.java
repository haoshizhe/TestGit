package com.pengjing.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.pengjing.domain.Book;

//BaseMapper
@Mapper
public interface BookDao extends BaseMapper<Book> {


}
