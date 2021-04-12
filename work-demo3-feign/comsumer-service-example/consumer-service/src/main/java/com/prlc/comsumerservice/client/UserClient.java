package com.prlc.comsumerservice.client;

import com.prlc.comsumerservice.entity.User;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * <pre>
 * classname UserClient
 * description
 * </pre>
 *
 * @author pengruolan
 * @date 2021/4/12  0:25
 **/
//声明当前类是一个Feign客户端，并指定生产者的服务名
@FeignClient("provider-service-prl")
public interface UserClient {

    @GetMapping("/provider/users") /* 实际地址：http://provider-service-prl/provider/users */
    List<User> query();

    @GetMapping("/provider/user/{id}")
    User queryById(@PathVariable("id") Integer id);

    @PostMapping("/provider/user/c")
    void createUser(User user);

    @PutMapping("/provider/user/u/{id}")
    void updateUser(@PathVariable("id") Integer id, User user);

    @DeleteMapping("/provider/user/d/{id}")
    void deleteUser(@PathVariable("id") Integer id);
}
