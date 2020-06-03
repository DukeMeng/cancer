package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.CervicalEpithelioma;

import java.util.List;

public interface CervicalEpitheliomaMapper {
    /**
     * @mbg.generated 2019-08-08
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int insert(CervicalEpithelioma record);

    /**
     * @mbg.generated 2019-08-08
     */
    int insertSelective(CervicalEpithelioma record);

    /**
     * @mbg.generated 2019-08-08
     */
    CervicalEpithelioma selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeySelective(CervicalEpithelioma record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKey(CervicalEpithelioma record);

    List<CervicalEpithelioma> selectByCondition(CervicalEpithelioma record);

    List<CervicalEpithelioma> selectAll();
}