package com.fancy.cancer.impl.mapper;

import com.fancy.cancer.api.po.Account;

public interface AccountMapper {
    /**
     *
     * @mbg.generated 2019-08-06
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-08-06
     */
    int insert(Account record);

    /**
     *
     * @mbg.generated 2019-08-06
     */
    int insertSelective(Account record);

    /**
     *
     * @mbg.generated 2019-08-06
     */
    Account selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2019-08-06
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     *
     * @mbg.generated 2019-08-06
     */
    int updateByPrimaryKey(Account record);


    Account selectByAccount(String account);
}