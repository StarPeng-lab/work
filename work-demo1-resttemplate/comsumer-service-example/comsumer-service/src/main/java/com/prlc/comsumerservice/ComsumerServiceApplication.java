package com.prlc.comsumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ComsumerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComsumerServiceApplication.class, args);
    }

    //@Autowired
    //private RestTemplateBuilder builder; //spring默认已经注入了RestTemplateBuilder实例

    /*@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }*/

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
