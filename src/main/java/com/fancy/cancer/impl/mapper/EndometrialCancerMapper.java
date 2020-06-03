package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.EndometrialCancer;

import java.util.List;

public interface EndometrialCancerMapper {
    /**
     *
     * @mbg.generated 2019-08-09
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int insert(EndometrialCancer record);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int insertSelective(EndometrialCancer record);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    EndometrialCancer selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int updateByPrimaryKeySelective(EndometrialCancer record);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int updateByPrimaryKeyWithBLOBs(EndometrialCancer record);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int updateByPrimaryKey(EndometrialCancer record);

    List<EndometrialCancer> selectByCondition(EndometrialCancer record);

    List<EndometrialCancer> selectAll();
}