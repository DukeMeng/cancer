package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.VulvarCancers;
import com.fancy.cancer.api.service.VulvarCancersService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.VulvarCancersMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VulvarCancersServiceImpl implements VulvarCancersService {

    @Autowired
    private VulvarCancersMapper vulvarCancersMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return vulvarCancersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(VulvarCancers record) {
        return 0;
    }

    @Override
    public int insertSelective(VulvarCancers record) {
        return vulvarCancersMapper.insertSelective(record);
    }

    @Override
    public VulvarCancers selectByPrimaryKey(Integer id) {
        return vulvarCancersMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(VulvarCancers record) {
        return vulvarCancersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(VulvarCancers record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(VulvarCancers record) {
        return 0;
    }

    @Override
    public PageInfo<VulvarCancers> selectPageInfo(VulvarCancers record, PageParam pageParam) {
        PageInfo<VulvarCancers> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> vulvarCancersMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(VulvarCancers record) {
        if (record.getId() != null) {
            return vulvarCancersMapper.updateByPrimaryKeySelective(record);
        }
        return vulvarCancersMapper.insertSelective(record);
    }
}
