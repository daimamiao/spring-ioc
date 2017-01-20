package com.daimamiao.hellospring.service;

import com.daimamiao.hellospring.dao.AccountDao;
import com.daimamiao.hellospring.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by xcc on 1/20/2017.
 */
//如果没有提供名称，那么默认情况下就是一个简单的类名(第一个字符小写)变成Bean名称。
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    /**
     * 需要注入的AccountDao对象
     */
    @Autowired
//    @Qualifier("accountDao1")
    private AccountDao accountDao;

    //占位符方式
//    @Value("${jdbc.url}")
//    private String url;
//    //SpEL表达方式，其中代表xml配置文件中的id值configProperties
//    @Value("#{configProperties['jdbc.username']}")
//    private String userName;
    /**
     * set值注入
     * @param accountDao
     */
//    public void setAccountDao(AccountDao accountDao) {
//        this.accountDao = accountDao;
//    }

    /**
     * 构造函数注入
     * @param accountDao
     */
    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void doSomething() {
        System.out.println("AccountServiceImpl#doSomething......");
        accountDao.addAccount();
    }

}
