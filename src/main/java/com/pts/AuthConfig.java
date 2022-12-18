//package com.pts;
//
//import com.pts.ServiceImpl.AccountServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class AuthConfig extends WebSecurityConfigurerAdapter {
//    @Autowired
//    AccountServiceImpl accountService;
//    @Bean
//    public BCryptPasswordEncoder getBCryptPasswordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//}
