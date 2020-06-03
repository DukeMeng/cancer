package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.EndometrialCancerField;

import java.util.List;

public interface EndometrialCancerFieldMapper {
    /**
     * @mbg.generated 2019-08-08
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int insert(EndometrialCancerField record);

    /**
     * @mbg.generated 2019-08-08
     */
    int insertSelective(EndometrialCancerField record);

    /**
     * @mbg.generated 2019-08-08
     */
    EndometrialCancerField selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeySelective(EndometrialCancerField record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKey(EndometrialCancerField record);

    List<EndometrialCancerField> selectByCondition(EndometrialCancerField record);

    List<EndometrialCancerField> selectAll();
}