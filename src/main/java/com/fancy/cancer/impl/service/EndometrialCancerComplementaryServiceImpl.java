package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.EndometrialCancerComplementary;
import com.fancy.cancer.api.service.EndometrialCancerComplementaryService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.EndometrialCancerComplementaryMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EndometrialCancerComplementaryServiceImpl implements EndometrialCancerComplementaryService {

    @Autowired
    private EndometrialCancerComplementaryMapper complementaryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return complementaryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(EndometrialCancerComplementary record) {
        return 0;
    }

    @Override
    public int insertSelective(EndometrialCancerComplementary record) {
        return complementaryMapper.insertSelective(record);
    }

    @Override
    public EndometrialCancerComplementary selectByPrimaryKey(Integer id) {
        return complementaryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(EndometrialCancerComplementary record) {
        return complementaryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(EndometrialCancerComplementary record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(EndometrialCancerComplementary record) {
        return 0;
    }

    @Override
    public PageInfo<EndometrialCancerComplementary> selectPageInfo(EndometrialCancerComplementary record, PageParam pageParam) {
        PageInfo<EndometrialCancerComplementary> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> complementaryMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(EndometrialCancerComplementary record) {
        if (record.getId() != null) {
            return complementaryMapper.updateByPrimaryKeySelective(record);
        }
        return complementaryMapper.insertSelective(record);
    }
}
