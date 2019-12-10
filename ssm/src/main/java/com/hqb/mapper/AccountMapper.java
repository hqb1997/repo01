package com.hqb.mapper;

import com.hqb.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountMapper {

    //查询所有
    @Select("select * from account")
    public List<Account> findAll();

    //保存账户信息
    @Insert("insert into account(name,money) values (#{name},#{money})")
    public void SaveAccount(Account account);
}
