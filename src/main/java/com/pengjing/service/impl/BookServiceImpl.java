package com.pengjing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pengjing.dao.BookDao;
import com.pengjing.domain.Book;
import com.pengjing.service.IBookService;
import org.springframework.stereotype.Service;

//ServiceImpl:两个泛型，一个是的实现类，对应的模型类
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
}
