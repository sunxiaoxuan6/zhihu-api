package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.FavoriteService;
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
@RequestMapping(value = "/api/favorite")
public class FavoriteController {
    @Resource
    private FavoriteService FavoriteService;

    @GetMapping(value = "/all")
    public Result getAllFavorite(){
        return Result.success(FavoriteService.getAllFavorite());
    }

    @GetMapping
    public Result getFavorite(){
        return Result.success(FavoriteService.getFavorite());
    }
}