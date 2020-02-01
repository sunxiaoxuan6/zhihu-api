package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Columns;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ABC
 * @date 2020/1/16 16:35
 */
@SpringBootTest(classes = ZhihuApiApplication.class)

class ColumnsServiceTest {
    @Resource
    private ColumnsMapper ColumnsMapper;

    @Test
    void getAllColumns() {
        List<Columns> columns=ColumnsMapper.getAllColumns();
        columns.forEach(System.out::println);
    }

    @Test
    void getColumns() {
        List<Columns> columns = ColumnsMapper.getColumns();
        columns.forEach(System.out::println);
    }
}