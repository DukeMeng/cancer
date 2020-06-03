package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.EndometrialCancerComplementary;

import java.util.List;

public interface EndometrialCancerComplementaryMapper {
    /**
     * @mbg.generated 2019-08-08
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int insert(EndometrialCancerComplementary record);

    /**
     * @mbg.generated 2019-08-08
     */
    int insertSelective(EndometrialCancerComplementary record);

    /**
     * @mbg.generated 2019-08-08
     */
    EndometrialCancerComplementary selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeySelective(EndometrialCancerComplementary record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeyWithBLOBs(EndometrialCancerComplementary record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKey(EndometrialCancerComplementary record);

    List<EndometrialCancerComplementary> selectByCondition(EndometrialCancerComplementary record);

    List<EndometrialCancerComplementary> selectAll();
}