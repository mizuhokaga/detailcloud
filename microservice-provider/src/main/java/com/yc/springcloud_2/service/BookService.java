package com.yc.springcloud_2.service;


import com.yc.springcloude_2.microserviceapi.bean.Book;

import java.util.List;

public interface BookService {

    public Book getBook(Integer id);

    public List<Book> findAll();
}
