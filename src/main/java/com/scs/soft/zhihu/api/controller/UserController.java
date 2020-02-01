package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author mq_xu
 * @description TODO
 * @create 2020/1/14
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping(value = "/all")
    public Result getAllUser(){
        return Result.success(userService.getAllUser());
    }

    @GetMapping
    public Result getUser(){
        return Result.success(userService.getUser());
    }
}