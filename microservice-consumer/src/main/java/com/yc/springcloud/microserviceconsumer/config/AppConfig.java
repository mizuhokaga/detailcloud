package com.yc.springcloud.microserviceconsumer.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Base64;

@SpringBootConfiguration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    @Bean
    public HttpHeaders getHeader(){
        HttpHeaders headers=new HttpHeaders();
        String auth ="admin:a";
        //加密处理
        byte[]encoudeAuth= Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader ="Basic"+new String(encoudeAuth);
        //http request  header
        headers.set("Authorization",authHeader);
        return  headers;

    }
}
