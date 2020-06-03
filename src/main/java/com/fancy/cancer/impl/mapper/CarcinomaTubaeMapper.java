package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.CarcinomaTubae;

import java.util.List;

public interface CarcinomaTubaeMapper {
    /**
     * @mbg.generated 2019-08-08
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int insert(CarcinomaTubae record);

    /**
     * @mbg.generated 2019-08-08
     */
    int insertSelective(CarcinomaTubae record);

    /**
     * @mbg.generated 2019-08-08
     */
    CarcinomaTubae selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeySelective(CarcinomaTubae record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeyWithBLOBs(CarcinomaTubae record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKey(CarcinomaTubae record);

    List<CarcinomaTubae> selectByCondition(CarcinomaTubae record);

    List<CarcinomaTubae> selectAll();
}