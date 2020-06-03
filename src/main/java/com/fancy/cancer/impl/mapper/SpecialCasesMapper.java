package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.SpecialCases;

import java.util.List;

public interface SpecialCasesMapper {
    /**
     * @mbg.generated 2019-08-08
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int insert(SpecialCases record);

    /**
     * @mbg.generated 2019-08-08
     */
    int insertSelective(SpecialCases record);

    /**
     * @mbg.generated 2019-08-08
     */
    SpecialCases selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeySelective(SpecialCases record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeyWithBLOBs(SpecialCases record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKey(SpecialCases record);

    List<SpecialCases> selectByCondition(SpecialCases record);

    List<SpecialCases> selectAll();
}