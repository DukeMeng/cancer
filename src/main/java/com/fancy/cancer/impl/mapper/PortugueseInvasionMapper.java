package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.PortugueseInvasion;

import java.util.List;

public interface PortugueseInvasionMapper {
    /**
     * @mbg.generated 2019-08-08
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int insert(PortugueseInvasion record);

    /**
     * @mbg.generated 2019-08-08
     */
    int insertSelective(PortugueseInvasion record);

    /**
     * @mbg.generated 2019-08-08
     */
    PortugueseInvasion selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKeySelective(PortugueseInvasion record);

    /**
     * @mbg.generated 2019-08-08
     */
    int updateByPrimaryKey(PortugueseInvasion record);

    List<PortugueseInvasion> selectByCondition(PortugueseInvasion record);

    List<PortugueseInvasion> selectAll();
}