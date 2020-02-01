package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author mq_xu
 * @description TODO
 * @create 2020/1/14
 */
@Data
@Builder
public class Columns {
    private Integer id;
    private String title;
    private String description;
    private String url;
    private String imageUrl;
    private Integer followers;
    private Integer articlesCount;
}
