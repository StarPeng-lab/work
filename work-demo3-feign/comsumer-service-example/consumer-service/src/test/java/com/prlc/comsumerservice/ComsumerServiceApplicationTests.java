package com.prlc.comsumerservice;

import com.prlc.comsumerservice.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
class ComsumerServiceApplicationTests {

    @Autowired
    public RestTemplate restTemplate;

    @Test
    void post() {
        User user = restTemplate.getForObject("http://localhost:10003/provider/user/1", User.class);
        System.out.println(user);
    }

}
