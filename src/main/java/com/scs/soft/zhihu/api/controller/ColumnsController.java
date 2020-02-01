package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.ColumnsService;
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
@RequestMapping(value = "/api/columns")
public class ColumnsController {
    @Resource
    private ColumnsService ColumnsService;

    @GetMapping(value = "/all")
    public Result getAllColumns(){
        return Result.success(ColumnsService.getAllColumns());
    }

    @GetMapping
    public Result getColumns(){
        return Result.success(ColumnsService.getColumns());
    }
}