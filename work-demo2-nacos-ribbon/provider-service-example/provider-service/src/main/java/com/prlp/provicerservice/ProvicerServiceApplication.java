package com.prlp.provicerservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.prlp.provicerservice.mapper")
@EnableDiscoveryClient
public class ProvicerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvicerServiceApplication.class, args);
    }

}
