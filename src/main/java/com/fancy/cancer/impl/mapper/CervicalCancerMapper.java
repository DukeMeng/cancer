package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.CervicalCancer;

import java.util.List;

public interface CervicalCancerMapper {
    /**
     *
     * @mbg.generated 2019-08-09
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int insert(CervicalCancer record);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int insertSelective(CervicalCancer record);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    CervicalCancer selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int updateByPrimaryKeySelective(CervicalCancer record);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int updateByPrimaryKeyWithBLOBs(CervicalCancer record);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int updateByPrimaryKey(CervicalCancer record);

    List<CervicalCancer> selectByCondition(CervicalCancer record);

    List<CervicalCancer> selectAll();
}