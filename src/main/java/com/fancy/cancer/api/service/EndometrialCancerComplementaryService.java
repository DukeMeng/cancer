package com.fancy.cancer.api.service;

import com.fancy.cancer.api.po.EndometrialCancerComplementary;
import com.fancy.cancer.common.utils.PageParam;
import com.github.pagehelper.PageInfo;

public interface EndometrialCancerComplementaryService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endometrial_cancer_complementary
     *
     * @mbg.generated Fri Aug 02 15:16:24 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endometrial_cancer_complementary
     *
     * @mbg.generated Fri Aug 02 15:16:24 CST 2019
     */
    int insert(EndometrialCancerComplementary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endometrial_cancer_complementary
     *
     * @mbg.generated Fri Aug 02 15:16:24 CST 2019
     */
    int insertSelective(EndometrialCancerComplementary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endometrial_cancer_complementary
     *
     * @mbg.generated Fri Aug 02 15:16:24 CST 2019
     */
    EndometrialCancerComplementary selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endometrial_cancer_complementary
     *
     * @mbg.generated Fri Aug 02 15:16:24 CST 2019
     */
    int updateByPrimaryKeySelective(EndometrialCancerComplementary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endometrial_cancer_complementary
     *
     * @mbg.generated Fri Aug 02 15:16:24 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(EndometrialCancerComplementary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table endometrial_cancer_complementary
     *
     * @mbg.generated Fri Aug 02 15:16:24 CST 2019
     */
    int updateByPrimaryKey(EndometrialCancerComplementary record);

    /**
     * 分页获取子宫内膜癌表
     * @param pageParam
     * @return
     */
    PageInfo<EndometrialCancerComplementary> selectPageInfo(EndometrialCancerComplementary record, PageParam pageParam);

    int insertData(EndometrialCancerComplementary record);
}