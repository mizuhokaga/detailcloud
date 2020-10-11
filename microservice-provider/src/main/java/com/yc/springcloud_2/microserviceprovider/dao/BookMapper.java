package com.yc.springcloud_2.microserviceprovider.dao;

import com.yc.springcloude_2.microserviceapi.bean.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends MisBaseMapper<Book> {
}
