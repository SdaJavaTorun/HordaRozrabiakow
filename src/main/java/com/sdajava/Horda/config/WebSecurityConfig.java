package com.sdajava.Horda.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by user on 2017-06-21.
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {  //zdefiniowanie formularza
        http.authorizeRequests()
                .antMatchers("/", "public").permitAll()
                //.antMatchers("/admin").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                //            .and()
                //           .httpBasic()
                .loginPage("/")
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/403");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{    //dane uzytkownikow
        auth    //ma to w pamieci tworzy a nie w bazie danych
                .inMemoryAuthentication()
                       .withUser("user").password("user").roles("USER")
                       .and()
                      .withUser("admin").password("admin").roles("ADMIN");

        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());    //skad ma pobierac nazwe uzytkownika
    }
}
