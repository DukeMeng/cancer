package com.fancy.cancer.api.service;

import com.fancy.cancer.api.po.SpecialCases;
import com.fancy.cancer.common.utils.PageParam;
import com.github.pagehelper.PageInfo;

public interface SpecialCasesService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_cases
     *
     * @mbg.generated Fri Aug 02 15:22:06 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_cases
     *
     * @mbg.generated Fri Aug 02 15:22:06 CST 2019
     */
    int insert(SpecialCases record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_cases
     *
     * @mbg.generated Fri Aug 02 15:22:06 CST 2019
     */
    int insertSelective(SpecialCases record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_cases
     *
     * @mbg.generated Fri Aug 02 15:22:06 CST 2019
     */
    SpecialCases selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_cases
     *
     * @mbg.generated Fri Aug 02 15:22:06 CST 2019
     */
    int updateByPrimaryKeySelective(SpecialCases record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_cases
     *
     * @mbg.generated Fri Aug 02 15:22:06 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(SpecialCases record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_cases
     *
     * @mbg.generated Fri Aug 02 15:22:06 CST 2019
     */
    int updateByPrimaryKey(SpecialCases record);

    /**
     * 分页获取特殊病例表
     * @param pageParam
     * @return
     */
    PageInfo<SpecialCases> selectPageInfo(SpecialCases record, PageParam pageParam);

    int insertData(SpecialCases record);
}