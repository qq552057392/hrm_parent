package com.lpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulAplication9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulAplication9527.class,args);
    }
}
