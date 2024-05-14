package com.yupi.usercenter;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.yupi.usercenter.mapper.UserMapper;
import com.yupi.usercenter.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SampleTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.isTrue(5 == userList.size(), "");
        userList.forEach(System.out::println);
    }

    @Test
    public void testSelect2() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}
