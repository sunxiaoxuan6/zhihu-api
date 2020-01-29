package com.scs.soft.zhihu.api.service.imlp;

import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.mapper.FavoriteMapper;
import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FavoriteImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;

    @Override
    public List<Favorite> getAllFavorite() {
        return favoriteMapper.getAllFavorite();
    }

    @Override
    public List<Favorite> getFavorite() {
        return favoriteMapper.getFavorite();
    }
}
