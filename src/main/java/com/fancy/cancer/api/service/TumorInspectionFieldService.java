package com.fancy.cancer.api.service;

import com.fancy.cancer.api.po.TumorInspectionField;
import com.fancy.cancer.common.utils.PageParam;
import com.github.pagehelper.PageInfo;

public interface TumorInspectionFieldService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tumor_inspection_field
     *
     * @mbg.generated Fri Aug 02 15:22:30 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tumor_inspection_field
     *
     * @mbg.generated Fri Aug 02 15:22:30 CST 2019
     */
    int insert(TumorInspectionField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tumor_inspection_field
     *
     * @mbg.generated Fri Aug 02 15:22:30 CST 2019
     */
    int insertSelective(TumorInspectionField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tumor_inspection_field
     *
     * @mbg.generated Fri Aug 02 15:22:30 CST 2019
     */
    TumorInspectionField selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tumor_inspection_field
     *
     * @mbg.generated Fri Aug 02 15:22:30 CST 2019
     */
    int updateByPrimaryKeySelective(TumorInspectionField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tumor_inspection_field
     *
     * @mbg.generated Fri Aug 02 15:22:30 CST 2019
     */
    int updateByPrimaryKey(TumorInspectionField record);

    /**
     * 分页获取妇科肿瘤检验检查项目字段表
     * @param pageParam
     * @return
     */
    PageInfo<TumorInspectionField> selectPageInfo(TumorInspectionField record, PageParam pageParam);

    int insertData(TumorInspectionField record);
}