package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.EndometrialCancer;
import com.fancy.cancer.api.service.EndometrialCancerService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.EndometrialCancerMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EndometrialCancerServiceImpl implements EndometrialCancerService {

    @Autowired
    private EndometrialCancerMapper cancerMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cancerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(EndometrialCancer record) {
        return 0;
    }

    @Override
    public int insertSelective(EndometrialCancer record) {
        return cancerMapper.insertSelective(record);
    }

    @Override
    public EndometrialCancer selectByPrimaryKey(Integer id) {
        return cancerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(EndometrialCancer record) {
        return cancerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(EndometrialCancer record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(EndometrialCancer record) {
        return 0;
    }

    @Override
    public PageInfo<EndometrialCancer> selectPageInfo(EndometrialCancer record, PageParam pageParam) {
        PageInfo<EndometrialCancer> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> cancerMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(EndometrialCancer record) {
        if (record.getId() != null) {
            return cancerMapper.updateByPrimaryKeySelective(record);
        }
        return cancerMapper.insertSelective(record);
    }
}
