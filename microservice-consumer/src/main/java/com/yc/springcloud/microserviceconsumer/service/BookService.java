package com.yc.springcloud.microserviceconsumer.service;


import com.yc.springcloud.microserviceconsumer.bean.Book;

import java.util.List;

public interface BookService {
    //消费者以 rest风格（socket+HttpClient+RestTemplat）去访问provider的服务
    public Book getBook(Integer id);

    public List<Book> findAll();
}
