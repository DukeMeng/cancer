package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.OvarianCancer;

import java.util.List;

public interface OvarianCancerMapper {
    /**
     *
     * @mbg.generated 2020-06-02
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2020-06-02
     */
    int insert(OvarianCancer record);

    /**
     *
     * @mbg.generated 2020-06-02
     */
    int insertSelective(OvarianCancer record);

    /**
     *
     * @mbg.generated 2020-06-02
     */
    OvarianCancer selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2020-06-02
     */
    int updateByPrimaryKeySelective(OvarianCancer record);

    /**
     *
     * @mbg.generated 2020-06-02
     */
    int updateByPrimaryKeyWithBLOBs(OvarianCancer record);

    /**
     *
     * @mbg.generated 2020-06-02
     */
    int updateByPrimaryKey(OvarianCancer record);

    List<OvarianCancer> selectByCondition(OvarianCancer record);
}