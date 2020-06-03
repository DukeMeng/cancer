package com.fancy.cancer.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.fancy.cancer.impl.mapper")
public class MybatisConfig {
}
