package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Favorite;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ABC
 * @date 2020/1/16 16:35
 */
@SpringBootTest(classes = ZhihuApiApplication.class)

class FavoriteServiceTest {
    @Resource
    private FavoriteMapper FavoriteMapper;

    @Test
    void getAllFavorite() {
        List<Favorite> favorites=FavoriteMapper.getAllFavorite();
        favorites.forEach(System.out::println);
    }

    @Test
    void getFavorite() {
        List<Favorite> favorites = FavoriteMapper.getFavorite();
        favorites.forEach(System.out::println);
    }
}