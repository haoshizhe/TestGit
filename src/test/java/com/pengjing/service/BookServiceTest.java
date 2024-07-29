package com.pengjing.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pengjing.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private IBookService bookService;

    @Test
    void testGetById() {
        System.out.println(bookService.getById(4));
    }

    @Test
    void testSave() {
//        需要自建一个保存的对象
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.save(book);
    }

    @Test
    void testUpdate() {
//        需要自建一个保存的对象
        Book book = new Book();
        book.setId(13);
        book.setType("------测试数据1789");
        book.setName("测试数据128973");
        book.setDescription("测试数据123");
        bookService.updateById(book);
    }

    @Test
    void testDelete() {
//        需要自建一个保存的对象
        bookService.removeById(14);
    }
    @Test
    void testGetAll() {
//        需要自建一个保存的对象
        System.out.println(bookService.list());;
    }

    @Test
    void testGetPage() {
        IPage<Book> page = new Page<Book>(2,5);
        IPage<Book> page1 = bookService.page(page);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
        System.out.println(page.getPages());
    }
}
