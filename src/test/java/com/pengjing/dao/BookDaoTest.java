package com.pengjing.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pengjing.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {
//        需要自建一个保存的对象
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.insert(book);
    }

    @Test
    void testUpdate() {
//        需要自建一个保存的对象
        Book book = new Book();
        book.setId(16);
        book.setType("测试数据1789");
        book.setName("测试数据128973");
        book.setDescription("测试数据123");
        bookDao.updateById(book);
    }

    @Test
    void testDelete() {
//        需要自建一个保存的对象
        bookDao.deleteById(16);
    }
    @Test
    void testGetAll() {
//        需要自建一个保存的对象
        System.out.println(bookDao.selectList(null));;
    }

    @Test
    void testGetPage() {
        IPage page = new Page(1,5);
        bookDao.selectPage(page, null);
    }

    @Test
    void testGetBy() {
//        需要创建一个queryWrapper的对象
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","java");
        System.out.println(bookDao.selectList(qw));;
    }

    @Test
    void testGetBy2() {

        String name = "小微贷";
//        需要创建一个queryWrapper的对象
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(Book::getName,name);
        System.out.println(bookDao.selectList(lqw));;
    }
//如果查询条件为空，我们如何判断
    @Test
    void testGetBy3() {

        String name = null;
//        需要创建一个queryWrapper的对象
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
//        like有一个判断条件:condition不为空我们再查询
        lqw.like(name !=null,Book::getName,name);
        System.out.println(bookDao.selectList(lqw));
    }
}
