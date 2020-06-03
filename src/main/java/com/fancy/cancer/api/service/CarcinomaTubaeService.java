package com.fancy.cancer.api.service;

import com.fancy.cancer.api.po.CarcinomaTubae;
import com.fancy.cancer.common.utils.PageParam;
import com.github.pagehelper.PageInfo;

public interface CarcinomaTubaeService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carcinoma_tubae
     *
     * @mbg.generated Fri Aug 02 15:11:04 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carcinoma_tubae
     *
     * @mbg.generated Fri Aug 02 15:11:04 CST 2019
     */
    int insert(CarcinomaTubae record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carcinoma_tubae
     *
     * @mbg.generated Fri Aug 02 15:11:04 CST 2019
     */
    int insertSelective(CarcinomaTubae record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carcinoma_tubae
     *
     * @mbg.generated Fri Aug 02 15:11:04 CST 2019
     */
    CarcinomaTubae selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carcinoma_tubae
     *
     * @mbg.generated Fri Aug 02 15:11:04 CST 2019
     */
    int updateByPrimaryKeySelective(CarcinomaTubae record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carcinoma_tubae
     *
     * @mbg.generated Fri Aug 02 15:11:04 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(CarcinomaTubae record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table carcinoma_tubae
     *
     * @mbg.generated Fri Aug 02 15:11:04 CST 2019
     */
    int updateByPrimaryKey(CarcinomaTubae record);

    /**
     * 分页获取输卵管癌表
     * @param pageParam
     * @return
     */
    PageInfo<CarcinomaTubae> selectPageInfo(CarcinomaTubae record, PageParam pageParam);

    int insertData(CarcinomaTubae record);

}