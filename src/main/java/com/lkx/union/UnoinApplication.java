package com.lkx.union;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.lkx.union.dao"})
public class UnoinApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnoinApplication.class, args);
    }

}
