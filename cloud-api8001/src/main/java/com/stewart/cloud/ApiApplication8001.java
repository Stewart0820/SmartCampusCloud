package com.stewart.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

/**
 * @author Stewart
 * @create 2021/9/27
 */
@SpringBootApplication
public class ApiApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication8001.class,args);

    }
}
