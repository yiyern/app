package com.ipenta;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
@MapperScan(basePackages = { "com.ipenta.mapper" })
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
