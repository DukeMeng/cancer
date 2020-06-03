package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.Choriocarcinoma;
import com.fancy.cancer.api.service.ChoriocarcinomaService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.ChoriocarcinomaMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChoriocarcinomaServiceImpl implements ChoriocarcinomaService {

    @Autowired
    private ChoriocarcinomaMapper choriocarcinomaMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return choriocarcinomaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Choriocarcinoma record) {
        return 0;
    }

    @Override
    public int insertSelective(Choriocarcinoma record) {
        return choriocarcinomaMapper.insertSelective(record);
    }

    @Override
    public Choriocarcinoma selectByPrimaryKey(Integer id) {
        return choriocarcinomaMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Choriocarcinoma record) {
        return choriocarcinomaMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Choriocarcinoma record) {
        return 0;
    }

    @Override
    public PageInfo<Choriocarcinoma> selectPageInfo(Choriocarcinoma record, PageParam pageParam) {
        PageInfo<Choriocarcinoma> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> choriocarcinomaMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(Choriocarcinoma record) {
        if (record.getId() != null) {
            return choriocarcinomaMapper.updateByPrimaryKeySelective(record);
        }
        return choriocarcinomaMapper.insertSelective(record);
    }
}
