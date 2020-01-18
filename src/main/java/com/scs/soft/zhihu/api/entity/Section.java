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
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
