package com.prlc.comsumerservice.controller;

import com.prlc.comsumerservice.client.UserClient;
import com.prlc.comsumerservice.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 * classname ConsumerFeignController
 * description
 * </pre>
 *
 * @author pengruolan
 * @date 2021/4/12  0:34
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerFeignController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/users")
    List<User> query() {
        return userClient.query();
    }

    @GetMapping("/user/{id}")
    User queryById(@PathVariable("id") Integer id) {
        return userClient.queryById(id);
    }

    @PostMapping("/user/c")
    void createUser(User user) {
        userClient.createUser(user);
    }

    @PutMapping("/user/u/{id}")
    void updateUser(@PathVariable("id") Integer id, User user) {
        user.setId(id);
        userClient.updateUser(id, user);
    }

    @DeleteMapping("/user/d/{id}")
    void deleteUser(@PathVariable("id") Integer id) {
        userClient.deleteUser(id);
    }

}
