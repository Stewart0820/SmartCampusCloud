package com.stewart.cloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan({"com.stewart.cloud.mapper","com.stewart.cloud.dao"})
public class MyBatisConfig {
}
