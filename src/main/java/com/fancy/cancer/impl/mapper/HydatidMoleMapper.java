package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.HydatidMole;

import java.util.List;

public interface HydatidMoleMapper {
    /**
     * @mbg.generated 2019-08-08
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int insert(HydatidMole record);

    /**
     * @mbg.generated 2019-08-08
     */
    int insertSelective(HydatidMole record);

    /**
     * @mbg.generated 2019-08-08
     */
    HydatidMole selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeySelective(HydatidMole record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKey(HydatidMole record);

    List<HydatidMole> selectByCondition(HydatidMole record);

    List<HydatidMole> selectAll();
}