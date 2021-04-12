package com.prlp.provicerservice.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.prlp.provicerservice.entity.User;
import com.prlp.provicerservice.mapper.UserMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <pre>
 * classname UserService
 * description
 * </pre>
 *
 * @author pengruolan
 * @date 2021/4/9  19:21
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryAllUser() {
        return userMapper.selectList(Wrappers.emptyWrapper());
    }

    public User queryById(Integer id) {
        return userMapper.selectById(id);
    }

    public void createUser(User user) {
        user.setId(6);
        user.setNickname("lan");
        userMapper.insert(user);
    }

    public void updateUserById(Integer id, User user) {
        user.setId(id);
        user.setNickname("update");
        userMapper.updateById(user);
    }

    public void deleteUserById(Integer id) {
        userMapper.deleteById(id);
    }

}
