package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.OvarianCancer;
import com.fancy.cancer.api.service.OvarianCancerService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.OvarianCancerMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OvarianCancerServiceImpl implements OvarianCancerService {

    @Autowired
    private OvarianCancerMapper ovarianCancerMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ovarianCancerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OvarianCancer record) {
        return 0;
    }

    @Override
    public int insertSelective(OvarianCancer record) {
        return ovarianCancerMapper.insertSelective(record);
    }

    @Override
    public OvarianCancer selectByPrimaryKey(Integer id) {
        return ovarianCancerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OvarianCancer record) {
        return ovarianCancerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(OvarianCancer record) {
        return 0;
    }


    @Override
    public int updateByPrimaryKey(OvarianCancer record) {
        return 0;
    }

    @Override
    public PageInfo<OvarianCancer> selectPageInfo(OvarianCancer record, PageParam pageParam) {
        PageInfo<OvarianCancer> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> ovarianCancerMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(OvarianCancer record) {
        if (record.getId() != null) {
            return ovarianCancerMapper.updateByPrimaryKeySelective(record);
        }
        return ovarianCancerMapper.insertSelective(record);
    }
}

