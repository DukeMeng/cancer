package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.PortugueseInvasion;
import com.fancy.cancer.api.service.PortugueseInvasionService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.PortugueseInvasionMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortugueseInvasionServiceImpl implements PortugueseInvasionService {

    @Autowired
    private PortugueseInvasionMapper invasionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return invasionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PortugueseInvasion record) {
        return 0;
    }

    @Override
    public int insertSelective(PortugueseInvasion record) {
        return invasionMapper.insertSelective(record);
    }

    @Override
    public PortugueseInvasion selectByPrimaryKey(Integer id) {
        return invasionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PortugueseInvasion record) {
        return invasionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PortugueseInvasion record) {
        return 0;
    }

    @Override
    public PageInfo<PortugueseInvasion> selectPageInfo(PortugueseInvasion record, PageParam pageParam) {
        PageInfo<PortugueseInvasion> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> invasionMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(PortugueseInvasion record) {
        if (record.getId() != null) {
            return invasionMapper.updateByPrimaryKeySelective(record);
        }
        return invasionMapper.insertSelective(record);
    }
}
