package com.luminousail.resourcehub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.luminousail.resourcehub.mapper")
@SpringBootApplication()
public class ResourceHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourceHubApplication.class, args);
    }

}
