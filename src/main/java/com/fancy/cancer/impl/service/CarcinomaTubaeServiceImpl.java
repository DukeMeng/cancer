package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.CarcinomaTubae;
import com.fancy.cancer.api.service.CarcinomaTubaeService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.CarcinomaTubaeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarcinomaTubaeServiceImpl implements CarcinomaTubaeService {

    @Autowired
    private CarcinomaTubaeMapper tubaeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tubaeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CarcinomaTubae record) {
        return 0;
    }

    @Override
    public int insertSelective(CarcinomaTubae record) {
        return tubaeMapper.insertSelective(record);
    }

    @Override
    public CarcinomaTubae selectByPrimaryKey(Integer id) {
        return tubaeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CarcinomaTubae record) {
        return tubaeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(CarcinomaTubae record) {
        return tubaeMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(CarcinomaTubae record) {
        return 0;
    }

    @Override
    public PageInfo<CarcinomaTubae> selectPageInfo(CarcinomaTubae carcinomaTubae, PageParam pageParam) {
        System.out.println("===========>"+carcinomaTubae.toString());
        PageInfo<CarcinomaTubae> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> tubaeMapper.selectByCondition(carcinomaTubae));
        return pageInfo;
    }

    @Override
    public int insertData(CarcinomaTubae record) {
        if (record.getId() != null) {
            return tubaeMapper.updateByPrimaryKeySelective(record);
        }
        return tubaeMapper.insertSelective(record);
    }

}
