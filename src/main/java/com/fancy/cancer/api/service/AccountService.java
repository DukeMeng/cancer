package com.fancy.cancer.api.service;

import com.fancy.cancer.api.po.Account;

public interface AccountService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Fri Aug 02 15:49:52 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Fri Aug 02 15:49:52 CST 2019
     */
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Fri Aug 02 15:49:52 CST 2019
     */
    int insertSelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Fri Aug 02 15:49:52 CST 2019
     */
    Account selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Fri Aug 02 15:49:52 CST 2019
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account
     *
     * @mbg.generated Fri Aug 02 15:49:52 CST 2019
     */
    int updateByPrimaryKey(Account record);

    Account selectByAccount(String account);
}