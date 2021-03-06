package com.fancy.cancer.api.service;

import com.fancy.cancer.api.po.OvarianCancer;
import com.fancy.cancer.common.utils.PageParam;
import com.github.pagehelper.PageInfo;

public interface OvarianCancerService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ovarian_cancer
     *
     * @mbg.generated Fri Aug 02 15:20:03 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ovarian_cancer
     *
     * @mbg.generated Fri Aug 02 15:20:03 CST 2019
     */
    int insert(OvarianCancer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ovarian_cancer
     *
     * @mbg.generated Fri Aug 02 15:20:03 CST 2019
     */
    int insertSelective(OvarianCancer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ovarian_cancer
     *
     * @mbg.generated Fri Aug 02 15:20:03 CST 2019
     */
    OvarianCancer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ovarian_cancer
     *
     * @mbg.generated Fri Aug 02 15:20:03 CST 2019
     */
    int updateByPrimaryKeySelective(OvarianCancer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ovarian_cancer
     *
     * @mbg.generated Fri Aug 02 15:20:03 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(OvarianCancer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ovarian_cancer
     *
     * @mbg.generated Fri Aug 02 15:20:03 CST 2019
     */
    int updateByPrimaryKey(OvarianCancer record);

    /**
     * 分页获取卵巢癌表
     * @param pageParam
     * @return
     */
    PageInfo<OvarianCancer> selectPageInfo(OvarianCancer record, PageParam pageParam);

    int insertData(OvarianCancer record);
}