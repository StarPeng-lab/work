package com.prlc.comsumerservice.controller;

import com.prlc.comsumerservice.entity.User;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <pre>
 * classname ConsumerController
 * description
 * </pre>
 *
 * @author pengruolan
 * @date 2021/4/9  20:08
 **/
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    //private static Logger logger = LoggerFactory.getLogger(ConsumerController.class);

    @RequestMapping("/consumer/users")
    public List<User> query() {
        String url = "http://provider-service-prl/provider/users";
        User[] users = restTemplate.getForObject(url, User[].class);
        return Arrays.asList(users);
    }

    @RequestMapping("/consumer/user/{id}")
    public User queryById(@PathVariable("id") Integer id) {
        String url = "http://provider-service-prl/provider/user/" + id;
        return restTemplate.getForObject(url, User.class);
    }

    @RequestMapping(value = "/consumer/user/c", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public void createUser(@RequestBody User user) {
        String url = "http://provider-service-prl/provider/user/c";
        restTemplate.postForObject(url, user, User.class);
    }

    @RequestMapping(value = "/consumer/user/u/{id}", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
    public void updateUser(@PathVariable("id") Integer id, @RequestBody User user) {
        String url = "http://provider-service-prl/provider/user/u/{id}";
        restTemplate.put(url, user, id); /*id????????????url???????????????{id}*/
    }

    @RequestMapping(value = "consumer/user/d/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public void deleteUser(@PathVariable("id") Integer id) {
        String url = "http://provider-service-prl/provider/user/d/" + id;
        restTemplate.delete(url, id);
    }

}
