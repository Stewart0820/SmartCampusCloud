package com.stewart.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Stewart
 * @create 2021/9/28
 */
@SpringBootApplication
@EnableSwagger2
public class AdminApplication8002 {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication8002.class,args);

    }
}