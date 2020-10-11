package com.yc.springcloud.microserviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MicroserviceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerApplication.class, args);
    }

}
