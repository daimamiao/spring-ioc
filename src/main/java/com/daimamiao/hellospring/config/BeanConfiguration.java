package com.daimamiao.hellospring.config;

import com.daimamiao.hellospring.dao.AccountDao;
import com.daimamiao.hellospring.dao.AccountDaoImpl;
import com.daimamiao.hellospring.service.AccountService;
import com.daimamiao.hellospring.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created by xcc on 1/20/2017.
 */
@Configurable
public class BeanConfiguration {
//    @Bean
//    public AccountDao accountDao() {
//        return new AccountDaoImpl();
//    }
//
//    @Bean
//    public AccountService accountService() {
//        AccountServiceImpl bean = new AccountServiceImpl();
//        bean.setAccountDao(accountDao());
//        return bean;
//    }
}
