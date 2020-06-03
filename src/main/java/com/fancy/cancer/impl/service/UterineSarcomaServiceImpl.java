package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.UterineSarcoma;
import com.fancy.cancer.api.service.UterineSarcomaService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.UterineSarcomaMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UterineSarcomaServiceImpl implements UterineSarcomaService {

    @Autowired
    private UterineSarcomaMapper uterineSarcomaMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return uterineSarcomaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UterineSarcoma record) {
        return 0;
    }

    @Override
    public int insertSelective(UterineSarcoma record) {
        return uterineSarcomaMapper.insertSelective(record);
    }

    @Override
    public UterineSarcoma selectByPrimaryKey(Integer id) {
        return uterineSarcomaMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UterineSarcoma record) {
        return uterineSarcomaMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UterineSarcoma record) {
        return 0;
    }

    @Override
    public PageInfo<UterineSarcoma> selectPageInfo(UterineSarcoma record, PageParam pageParam) {
        PageInfo<UterineSarcoma> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> uterineSarcomaMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(UterineSarcoma record) {
        if (record.getId() != null) {
            return uterineSarcomaMapper.updateByPrimaryKeySelective(record);
        }
        return uterineSarcomaMapper.insertSelective(record);
    }
}
