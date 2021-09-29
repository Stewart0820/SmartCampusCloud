package com.stewart.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Stewart
 * @create 2021/9/27
 */
@SpringBootApplication
@EnableEurekaServer
public class EnkuraServerApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run(EnkuraServerApplication7001.class,args);
    }
}
