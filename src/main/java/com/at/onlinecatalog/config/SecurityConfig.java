package com.at.onlinecatalog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration   //this class configurate a part from spring framework
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


}
