package com.hqb.service.impl;

import com.hqb.mapper.AccountMapper;
import com.hqb.pojo.Account;
import com.hqb.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户");
        return accountMapper.findAll();
    }

    @Override
    public void SaveAccount(Account account) {
        System.out.println("业务层：保存账户");
        accountMapper.SaveAccount(account);
    }
}
