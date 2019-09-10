//package com.lkx.unoin.config;
//
//import org.apache.shiro.mgt.DefaultSecurityManager;
//import org.apache.shiro.mgt.SecurityManager;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @ClassName: ShiroConfig
// * @Author: KunxianLi
// * @Description: ${description}
// * @Date: 2019/9/4 10:50
// * @Version: 1.0
// */
//@Configuration
//public class ShiroConfig {
//
//    @Bean("shiroFilter")
//    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//        shiroFilterFactoryBean.setSecurityManager(securityManager);
//        return shiroFilterFactoryBean;
//    }
//
//    @Bean("securityManager")
//    public SecurityManager securityManager(MyRealm myRealm){
//        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
//        defaultSecurityManager.setRealm(myRealm);
//        return defaultSecurityManager;
//    }
//
//}
