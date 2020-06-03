package com.fancy.cancer.impl.service;

import com.fancy.cancer.api.po.Account;
import com.fancy.cancer.api.service.AccountService;
import com.fancy.cancer.impl.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Account record) {
        return 0;
    }

    @Override
    public int insertSelective(Account record) {
        return 0;
    }

    @Override
    public Account selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public Account selectByAccount(String account) {
        return accountMapper.selectByAccount(account);
    }

    @Override
    public int updateByPrimaryKeySelective(Account record) {
        return accountMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Account record) {
        return 0;
    }
}
