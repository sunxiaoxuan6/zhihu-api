package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> getAllUser();

    /***
     * 查询1个用户
     * @Return
     */
    List<User> getUser();
}