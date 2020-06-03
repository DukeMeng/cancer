package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.CervicalEpithelioma;
import com.fancy.cancer.api.service.CervicalEpitheliomaService;
import com.fancy.cancer.common.utils.PageParam;
import com.fancy.cancer.impl.mapper.CervicalEpitheliomaMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CervicalEpitheliomaServiceImpl implements CervicalEpitheliomaService {

    @Autowired
    private CervicalEpitheliomaMapper epitheliomaMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return epitheliomaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CervicalEpithelioma record) {
        return 0;
    }

    @Override
    public int insertSelective(CervicalEpithelioma record) {
        return epitheliomaMapper.insertSelective(record);
    }

    @Override
    public CervicalEpithelioma selectByPrimaryKey(Integer id) {
        return epitheliomaMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CervicalEpithelioma record) {
        return epitheliomaMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CervicalEpithelioma record) {
        return 0;
    }

    @Override
    public PageInfo<CervicalEpithelioma> selectPageInfo(CervicalEpithelioma record, PageParam pageParam) {
        PageInfo<CervicalEpithelioma> pageInfo = PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true).doSelectPageInfo(() -> epitheliomaMapper.selectByCondition(record));
        return pageInfo;
    }

    @Override
    public int insertData(CervicalEpithelioma record) {
        if (record.getId() != null) {
            return epitheliomaMapper.updateByPrimaryKeySelective(record);
        }
        return epitheliomaMapper.insertSelective(record);
    }
}
