package com.daimamiao.hellospring.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by xcc on 1/20/2017.
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Override
    public void addAccount() {
        System.out.println("addAccount......");
    }
}
