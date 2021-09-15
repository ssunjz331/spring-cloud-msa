package com.example.userservicce.security;

import com.example.userservicce.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    Environment env;
    UserService userService;
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public WebSecurity() {
        this.env =  env;
        this.userService = userService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/users/**").permitAll();
        http.authorizeRequests().antMatchers("/actuator/**").permitAll();
//        http.authorizeRequests().antMatchers("/**")
//                .hasIpAddress("192.168.0.8")
//                .and()
//                .addFilter(getAuthenticationFilter());
        
        http.headers().frameOptions().disable();
    }
}
