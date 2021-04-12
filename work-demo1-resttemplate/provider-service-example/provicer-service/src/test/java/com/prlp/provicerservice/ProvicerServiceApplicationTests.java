package com.prlp.provicerservice;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.prlp.provicerservice.entity.User;
import com.prlp.provicerservice.mapper.UserMapper;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProvicerServiceApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void testSelect() {
        System.out.println("------ prl ------");
        List<User> users = userMapper.selectList(Wrappers.emptyWrapper());
        Assert.assertEquals(5, users.size());
        users.forEach(System.out::println);
        System.out.println(users.get(0).getNickname());
    }

}
