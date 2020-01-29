package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Favorite;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author mq_xu
 * @description TODO
 * @create 2020/1/14
 */
public interface FavoriteMapper {
    /**
     * 查询所有收藏
     * @return
     */
    @Select(" SELECT * FROM t_favorite ")
    List<Favorite> getAllFavorite();

    /**
     * 查询前4个收藏
     */
    @Select(" SELECT * FROM t_favorite ORDER BY total_count DESC LIMIT 0,4 ")
    List<Favorite> getFavorite();
}

