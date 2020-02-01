package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Columns;

import java.util.List;

public interface ColumnsService {
    /**
     * 查询所有收藏
     * @return
     */
    List<Columns> getAllColumns();

    /***
     * 查询前4个收藏
     * @Return
     */
    List<Columns> getColumns();
}