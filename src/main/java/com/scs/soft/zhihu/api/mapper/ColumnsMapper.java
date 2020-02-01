package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Columns;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author mq_xu
 * @description TODO
 * @create 2020/1/14
 */
public interface ColumnsMapper {
    /**
     * 查询所有专题
     * @return
     */
    @Select(" SELECT * FROM t_columns ")
    List<Columns> getAllColumns();

    /**
     * 查询前4个专题
     */
    @Select(" SELECT * FROM t_columns ORDER BY articles_count DESC LIMIT 0,4 ")
    List<Columns> getColumns();
}

