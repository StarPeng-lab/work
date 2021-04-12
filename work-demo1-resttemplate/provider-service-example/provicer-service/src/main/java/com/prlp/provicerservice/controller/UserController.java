package com.prlp.provicerservice.controller;

import com.prlp.provicerservice.entity.User;
import com.prlp.provicerservice.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 * classname UserController
 * description
 * </pre>
 *
 * @author pengruolan
 * @date 2021/4/9  19:21
 **/
@RestController
//@Validated
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/provider/users", method = RequestMethod.GET, produces = "application/json")
    public List<User> queryAllUser() {
        return userService.queryAllUser();
    }

    @RequestMapping(value = "/provider/user/{id}", method = RequestMethod.GET, produces = "application/json")
    public User queryById(@PathVariable("id") Integer id) {
        return userService.queryById(id);
    }

    @RequestMapping(value = "/provider/user/c", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @RequestMapping(value = "/provider/user/u/{id}", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
    public void updateUser(@PathVariable("id") Integer id, @RequestBody User user) {
        userService.updateUserById(id, user);
    }

    @RequestMapping(value = "/provider/user/d/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public void deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUserById(id);
    }


}
