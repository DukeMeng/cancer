package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.UterineSarcoma;

import java.util.List;

public interface UterineSarcomaMapper {
    /**
     *
     * @mbg.generated 2019-08-09
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int insert(UterineSarcoma record);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int insertSelective(UterineSarcoma record);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    UterineSarcoma selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int updateByPrimaryKeySelective(UterineSarcoma record);

    /**
     *
     * @mbg.generated 2019-08-09
     */
    int updateByPrimaryKey(UterineSarcoma record);

    List<UterineSarcoma> selectByCondition(UterineSarcoma record);

    List<UterineSarcoma> selectAll();
}