package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.entity.Special;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.sql.Date;
import java.util.List;
import java.util.Map;

/**
 * @author mq_xu
 * @description TODO
 * @create 2020/1/14
 */
public interface RoundTableMapper {
    /**
     * 查询所有圆桌讨论
     * @return
     */
    @Select(" SELECT * FROM t_round_table ")
    List<RoundTable> getAllRoundTable();

    /**
     * 查询前4个圆桌讨论
     */
    @Select(" SELECT * FROM t_round_table ORDER BY visits_count DESC LIMIT 0,4 ")
    List<RoundTable> getRoundTable();
}

