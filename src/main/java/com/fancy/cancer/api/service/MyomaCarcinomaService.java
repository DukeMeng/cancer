package com.fancy.cancer.api.service;

import com.fancy.cancer.api.po.MyomaCarcinoma;
import com.fancy.cancer.common.utils.PageParam;
import com.github.pagehelper.PageInfo;

public interface MyomaCarcinomaService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myoma_carcinoma
     *
     * @mbg.generated Fri Aug 02 15:18:12 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myoma_carcinoma
     *
     * @mbg.generated Fri Aug 02 15:18:12 CST 2019
     */
    int insert(MyomaCarcinoma record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myoma_carcinoma
     *
     * @mbg.generated Fri Aug 02 15:18:12 CST 2019
     */
    int insertSelective(MyomaCarcinoma record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myoma_carcinoma
     *
     * @mbg.generated Fri Aug 02 15:18:12 CST 2019
     */
    MyomaCarcinoma selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myoma_carcinoma
     *
     * @mbg.generated Fri Aug 02 15:18:12 CST 2019
     */
    int updateByPrimaryKeySelective(MyomaCarcinoma record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myoma_carcinoma
     *
     * @mbg.generated Fri Aug 02 15:18:12 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(MyomaCarcinoma record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table myoma_carcinoma
     *
     * @mbg.generated Fri Aug 02 15:18:12 CST 2019
     */
    int updateByPrimaryKey(MyomaCarcinoma record);

    /**
     * 分页获取未定平滑肌瘤癌表
     * @param pageParam
     * @return
     */
    PageInfo<MyomaCarcinoma> selectPageInfo(MyomaCarcinoma record, PageParam pageParam);

    int insertData(MyomaCarcinoma record);
}