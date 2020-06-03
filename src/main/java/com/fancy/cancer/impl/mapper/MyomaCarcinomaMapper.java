package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.MyomaCarcinoma;

import java.util.List;

public interface MyomaCarcinomaMapper {
    /**
     * @mbg.generated 2019-08-08
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int insert(MyomaCarcinoma record);

    /**
     * @mbg.generated 2019-08-08
     */
    int insertSelective(MyomaCarcinoma record);

    /**
     * @mbg.generated 2019-08-08
     */
    MyomaCarcinoma selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeySelective(MyomaCarcinoma record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeyWithBLOBs(MyomaCarcinoma record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKey(MyomaCarcinoma record);

    List<MyomaCarcinoma> selectByCondition(MyomaCarcinoma record);

    List<MyomaCarcinoma> selectAll();
}