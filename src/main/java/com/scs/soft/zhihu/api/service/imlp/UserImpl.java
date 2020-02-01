package com.scs.soft.zhihu.api.service.imlp;

import com.scs.soft.zhihu.api.entity.User;
import com.scs.soft.zhihu.api.mapper.UserMapper;
import com.scs.soft.zhihu.api.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public List<User> getUser() {
        return userMapper.getUser();
    }
}
