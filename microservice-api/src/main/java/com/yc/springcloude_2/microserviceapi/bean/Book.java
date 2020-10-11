package com.yc.springcloude_2.microserviceapi.bean;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
@Data
@Table(name="book")//jpa注解,将java类关联表
public class Book {
    // JPA注解,指定此属性为表中的主键
    @Id
    //注意: 对应的数据表中的字段名叫 book_id
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private BigDecimal bookPrice;
    private Date bookDate;
    private Integer userId;
}
