package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.Sarcoma;
import com.fancy.cancer.api.service.SarcomaService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.SarcomaMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SarcomaServiceImpl implements SarcomaService {

    @Autowired
    private SarcomaMapper sarcomaMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return sarcomaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Sarcoma record) {
        return 0;
    }

    @Override
    public int insertSelective(Sarcoma record) {
        return sarcomaMapper.insertSelective(record);
    }

    @Override
    public Sarcoma selectByPrimaryKey(Integer id) {
        return sarcomaMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Sarcoma record) {
        return sarcomaMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Sarcoma record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Sarcoma record) {
        return 0;
    }

    @Override
    public PageInfo<Sarcoma> selectPageInfo(Sarcoma record, PageParam pageParam) {
        PageInfo<Sarcoma> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> sarcomaMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(Sarcoma record) {
        if (record.getId() != null) {
            return sarcomaMapper.updateByPrimaryKeySelective(record);
        }
        return sarcomaMapper.insertSelective(record);
    }
}
