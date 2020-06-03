package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.Sarcoma;

import java.util.List;

public interface SarcomaMapper {
    /**
     * @mbg.generated 2019-08-08
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int insert(Sarcoma record);

    /**
     * @mbg.generated 2019-08-08
     */
    int insertSelective(Sarcoma record);

    /**
     * @mbg.generated 2019-08-08
     */
    Sarcoma selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeySelective(Sarcoma record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeyWithBLOBs(Sarcoma record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKey(Sarcoma record);

    List<Sarcoma> selectByCondition(Sarcoma record);

    List<Sarcoma> selectAll();
}