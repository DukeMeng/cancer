package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.EndometrialCancerField;
import com.fancy.cancer.api.service.EndometrialCancerFieldService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.EndometrialCancerFieldMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EndometrialCancerFieldServiceImpl implements EndometrialCancerFieldService {

    @Autowired
    private EndometrialCancerFieldMapper fieldMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return fieldMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(EndometrialCancerField record) {
        return 0;
    }

    @Override
    public int insertSelective(EndometrialCancerField record) {
        return fieldMapper.insertSelective(record);
    }

    @Override
    public EndometrialCancerField selectByPrimaryKey(Integer id) {
        return fieldMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(EndometrialCancerField record) {
        return fieldMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(EndometrialCancerField record) {
        return 0;
    }

    @Override
    public PageInfo<EndometrialCancerField> selectPageInfo(EndometrialCancerField record, PageParam pageParam) {
        PageInfo<EndometrialCancerField> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> fieldMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(EndometrialCancerField record) {
        if (record.getId() != null) {
            return fieldMapper.updateByPrimaryKeySelective(record);
        }
        return fieldMapper.insertSelective(record);
    }
}
