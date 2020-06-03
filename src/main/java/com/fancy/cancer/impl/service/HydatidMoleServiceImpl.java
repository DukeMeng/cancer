package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.HydatidMole;
import com.fancy.cancer.api.service.HydatidMoleService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.HydatidMoleMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HydatidMoleServiceImpl implements HydatidMoleService {

    @Autowired
    private HydatidMoleMapper hydatidMoleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return hydatidMoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(HydatidMole record) {
        return 0;
    }

    @Override
    public int insertSelective(HydatidMole record) {
        return hydatidMoleMapper.insertSelective(record);
    }

    @Override
    public HydatidMole selectByPrimaryKey(Integer id) {
        return hydatidMoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(HydatidMole record) {
        return hydatidMoleMapper.updateByPrimaryKeySelective(record);
    }


    @Override
    public int updateByPrimaryKey(HydatidMole record) {
        return 0;
    }

    @Override
    public PageInfo<HydatidMole> selectPageInfo(HydatidMole record, PageParam pageParam) {
        PageInfo<HydatidMole> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> hydatidMoleMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(HydatidMole record) {
        if (record.getId() != null) {
            return hydatidMoleMapper.updateByPrimaryKeySelective(record);
        }
        return hydatidMoleMapper.insertSelective(record);
    }
}
