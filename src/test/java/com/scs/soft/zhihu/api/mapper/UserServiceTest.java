package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ABC
 * @date 2020/1/16 16:35
 */
@SpringBootTest(classes = ZhihuApiApplication.class)

class UserServiceTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void getAllUser() {
        List<User> users=userMapper.getAllUser();
        users.forEach(System.out::println);
    }

    @Test
    void getUser() {
        List<User> users = userMapper.getUser();
        users.forEach(System.out::println);
    }
}