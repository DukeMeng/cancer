package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.SpecialCases;
import com.fancy.cancer.api.service.SpecialCasesService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.SpecialCasesMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecialCasesServiceImpl implements SpecialCasesService {

    @Autowired
    private SpecialCasesMapper casesMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return casesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SpecialCases record) {
        return 0;
    }

    @Override
    public int insertSelective(SpecialCases record) {
        return casesMapper.insertSelective(record);
    }

    @Override
    public SpecialCases selectByPrimaryKey(Integer id) {
        return casesMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SpecialCases record) {
        return casesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(SpecialCases record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SpecialCases record) {
        return 0;
    }

    @Override
    public PageInfo<SpecialCases> selectPageInfo(SpecialCases record, PageParam pageParam) {
        PageInfo<SpecialCases> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> casesMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(SpecialCases record) {
        if (record.getId() != null) {
            return casesMapper.updateByPrimaryKeySelective(record);
        }
        return casesMapper.insertSelective(record);
    }
}