package com.hqb.service;

import com.hqb.pojo.Account;

import java.util.List;

public interface AccountService {

    //查询所有
    public List<Account> findAll();

    //保存账户信息
    public void SaveAccount(Account account);
}
