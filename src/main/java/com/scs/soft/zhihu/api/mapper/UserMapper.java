package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author mq_xu
 * @description TODO
 * @create 2020/1/14
 */
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    @Select(" SELECT * FROM t_user")
    List<User> getAllUser();

    /**
     * 查询1个用户
     */
    @Select(" SELECT * FROM t_user ORDER BY mobile DESC LIMIT 0,1 ")
    List<User> getUser();
}

