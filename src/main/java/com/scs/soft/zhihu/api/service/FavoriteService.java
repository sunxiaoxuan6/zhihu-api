package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Favorite;

import java.util.List;

public interface FavoriteService {
    /**
     * 查询所有收藏
     * @return
     */
    List<Favorite> getAllFavorite();

    /***
     * 查询前4个收藏
     * @Return
     */
    List<Favorite> getFavorite();
}