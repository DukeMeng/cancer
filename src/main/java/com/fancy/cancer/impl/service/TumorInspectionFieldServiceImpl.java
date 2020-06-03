package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.TumorInspectionField;
import com.fancy.cancer.api.service.TumorInspectionFieldService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.TumorInspectionFieldMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TumorInspectionFieldServiceImpl implements TumorInspectionFieldService {

    @Autowired
    private TumorInspectionFieldMapper inspectionFieldMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return inspectionFieldMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TumorInspectionField record) {
        return 0;
    }

    @Override
    public int insertSelective(TumorInspectionField record) {
        return inspectionFieldMapper.insertSelective(record);
    }

    @Override
    public TumorInspectionField selectByPrimaryKey(Integer id) {
        return inspectionFieldMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TumorInspectionField record) {
        return inspectionFieldMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TumorInspectionField record) {
        return 0;
    }

    @Override
    public PageInfo<TumorInspectionField> selectPageInfo(TumorInspectionField record, PageParam pageParam) {
        PageInfo<TumorInspectionField> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> inspectionFieldMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(TumorInspectionField record) {
        if (record.getId() != null) {
            return inspectionFieldMapper.updateByPrimaryKeySelective(record);
        }
        return inspectionFieldMapper.insertSelective(record);
    }
}
