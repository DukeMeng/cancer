package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.TumorInspectionField;

import java.util.List;

public interface TumorInspectionFieldMapper {
    /**
     * @mbg.generated 2019-08-08
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int insert(TumorInspectionField record);

    /**
     * @mbg.generated 2019-08-08
     */
    int insertSelective(TumorInspectionField record);

    /**
     * @mbg.generated 2019-08-08
     */
    TumorInspectionField selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeySelective(TumorInspectionField record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKey(TumorInspectionField record);

    List<TumorInspectionField> selectByCondition(TumorInspectionField record);

    List<TumorInspectionField> selectAll();
}