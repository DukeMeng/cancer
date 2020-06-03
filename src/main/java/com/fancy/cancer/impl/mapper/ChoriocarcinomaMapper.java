package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.Choriocarcinoma;

import java.util.List;

public interface ChoriocarcinomaMapper {
    /**
     * @mbg.generated 2019-08-08
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int insert(Choriocarcinoma record);

    /**
     * @mbg.generated 2019-08-08
     */
    int insertSelective(Choriocarcinoma record);

    /**
     * @mbg.generated 2019-08-08
     */
    Choriocarcinoma selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeySelective(Choriocarcinoma record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKey(Choriocarcinoma record);

    List<Choriocarcinoma> selectByCondition(Choriocarcinoma record);

    List<Choriocarcinoma> selectAll();
}