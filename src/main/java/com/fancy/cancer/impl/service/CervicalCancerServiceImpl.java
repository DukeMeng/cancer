package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.CervicalCancer;
import com.fancy.cancer.api.service.CervicalCancerService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.CervicalCancerMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CervicalCancerServiceImpl implements CervicalCancerService {

    @Autowired
    private CervicalCancerMapper cancerMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cancerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CervicalCancer record) {
        return 0;
    }

    @Override
    public int insertSelective(CervicalCancer record) {
        return cancerMapper.insertSelective(record);
    }

    @Override
    public CervicalCancer selectByPrimaryKey(Integer id) {
        return cancerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CervicalCancer record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(CervicalCancer record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CervicalCancer record) {
        return 0;
    }

    @Override
    public PageInfo<CervicalCancer> selectPageInfo(CervicalCancer record, PageParam pageParam) {
        PageInfo<CervicalCancer> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> cancerMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(CervicalCancer record) {
        if (record.getId() != null) {
            return cancerMapper.updateByPrimaryKeySelective(record);
        }
        return cancerMapper.insertSelective(record);
    }
}
