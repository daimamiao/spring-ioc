package com.daimamiao.hellospring;


import com.daimamiao.hellospring.config.BeanConfiguration;
import com.daimamiao.hellospring.pojo.Account;
import com.daimamiao.hellospring.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-ioc.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
//        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//        AccountService accountService = (AccountService) config.getBean("accountService");
//        Account account = (Account) applicationContext.getBean("account");
//        System.out.println(account.getName());
        accountService.doSomething();
    }
}
