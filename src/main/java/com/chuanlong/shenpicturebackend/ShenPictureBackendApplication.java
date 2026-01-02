package com.chuanlong.shenpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.chuanlong.shenpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class ShenPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShenPictureBackendApplication.class, args);
    }

}
