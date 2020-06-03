package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.VulvarCancers;

import java.util.List;

public interface VulvarCancersMapper {
    /**
     *
     * @mbg.generated 2019-08-08
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-08-08
     */
    int insert(VulvarCancers record);

    /**
     *
     * @mbg.generated 2019-08-08
     */
    int insertSelective(VulvarCancers record);

    /**
     *
     * @mbg.generated 2019-08-08
     */
    VulvarCancers selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeySelective(VulvarCancers record);

    /**
     *
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeyWithBLOBs(VulvarCancers record);

    /**
     *
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKey(VulvarCancers record);

    List<VulvarCancers> selectByCondition(VulvarCancers record);

    List<VulvarCancers> selectAll();
}