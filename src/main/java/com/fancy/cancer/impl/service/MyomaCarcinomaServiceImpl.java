package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.MyomaCarcinoma;
import com.fancy.cancer.api.service.MyomaCarcinomaService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.MyomaCarcinomaMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyomaCarcinomaServiceImpl implements MyomaCarcinomaService {

    @Autowired
    private MyomaCarcinomaMapper myomaCarcinomaMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return myomaCarcinomaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MyomaCarcinoma record) {
        return 0;
    }

    @Override
    public int insertSelective(MyomaCarcinoma record) {
        return myomaCarcinomaMapper.insertSelective(record);
    }

    @Override
    public MyomaCarcinoma selectByPrimaryKey(Integer id) {
        return myomaCarcinomaMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MyomaCarcinoma record) {
        return myomaCarcinomaMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(MyomaCarcinoma record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(MyomaCarcinoma record) {
        return 0;
    }

    @Override
    public PageInfo<MyomaCarcinoma> selectPageInfo(MyomaCarcinoma record, PageParam pageParam) {
        PageInfo<MyomaCarcinoma> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> myomaCarcinomaMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(MyomaCarcinoma record) {
        if (record.getId() != null) {
            return myomaCarcinomaMapper.updateByPrimaryKeySelective(record);
        }
        return myomaCarcinomaMapper.insertSelective(record);
    }
}
