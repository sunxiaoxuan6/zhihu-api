package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author mq_xu
 * @description TODO
 * @create 2020/1/14
 */
@Data
@Builder
public class User {
    private String id;
    private String mobile;
    private String email;
    private String password;
    private String name;
    private String urlToken;
    private String avatarUrl;
    private String url;
    private String headline;
    private String description;
    private Integer gender;
    private String location;
    private String business;
    private String employment;
    private String education;
    private String userCover;
    private Timestamp created;
}
