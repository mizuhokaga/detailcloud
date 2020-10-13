package com.yc.springcloud.microserviceconsumer.service;


import com.yc.springcloud.microserviceconsumer.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BookServiceImpl implements  BookService{
    private static  final String URL="http://localhost:8888/book/";
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;

    @Override
    public Book getBook(@PathVariable("id") Integer id) {
        //远程调用mis-provider中的服务逻辑.
        // 这里采用通用服务名来自动查找这个服务名下的服务列表，并通过ribbon实现自动负载均衡.
       //return this.restTemplate.getForObject(URL+id,Book.class);

        //return restTemplate.getForObject(URL+id,Book.class);
        //   HttpEntity(    MultiValueMap)   ,    HttpHeaders: MultiValueMap
        //   返回: ResponseEntity
        return restTemplate.exchange( URL+id, HttpMethod.GET, new HttpEntity<Object>(  httpHeaders   ), Book.class ).getBody();
    }

    @Override
    public List<Book> findAll( ){
        // return restTemplate.getForObject(URL+"findAll",   List.class);
        return restTemplate.exchange(URL+"findAll",HttpMethod.GET, new HttpEntity<Object>(  httpHeaders ), List.class).getBody();
    }
}
