package com.yc.springcloud.microserviceconsumer.service;


import com.yc.springcloud.microserviceconsumer.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookServiceImpl implements  BookService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Book getBook(Integer id) {
        //远程调用mis-provider中的服务逻辑.
        // 这里采用通用服务名来自动查找这个服务名下的服务列表，并通过ribbon实现自动负载均衡.
       return this.restTemplate.getForObject("http://localhost:8888/book/"+id,Book.class);
    }
}
