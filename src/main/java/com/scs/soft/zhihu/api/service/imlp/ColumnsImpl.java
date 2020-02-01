package com.scs.soft.zhihu.api.service.imlp;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.mapper.ColumnsMapper;
import com.scs.soft.zhihu.api.service.ColumnsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ColumnsImpl implements ColumnsService {
    @Resource
    private ColumnsMapper ColumnsMapper;

    @Override
    public List<Columns> getAllColumns() {
        return ColumnsMapper.getAllColumns();
    }

    @Override
    public List<Columns> getColumns() {
        return ColumnsMapper.getColumns();
    }
}
