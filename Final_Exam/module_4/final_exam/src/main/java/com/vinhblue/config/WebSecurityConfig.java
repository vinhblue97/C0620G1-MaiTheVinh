package com.vinhblue.config;


import com.vinhblue.model.service.user.impl.UserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserDetailServiceImpl userDetailService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Bean
    public RoleHierarchy roleHierarchy() {
        RoleHierarchyImpl hierarchy = new RoleHierarchyImpl();
        hierarchy.setHierarchy("Admin > User");
        return hierarchy;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // csrf
        http.csrf().disable();
        // login
        http.formLogin()
                .loginProcessingUrl("/checkLogin")
                .loginPage("/login")
                // login successful
                .defaultSuccessUrl("/home")
                // login failed
                .failureUrl("/login?error=true")
                // setting username, password
                .usernameParameter("username")
                .passwordParameter("password")
                // logout
                .and().logout().logoutUrl("/logout")
                // logout successful
                .logoutSuccessUrl("/login");
        // authorization
        // guest
        http.authorizeRequests().antMatchers("/", "/login", "/logout", "/home").permitAll();

        //user
//        http.authorizeRequests().antMatchers("/", "/employee")
//                .access("hasAnyRole('ROLE_RECEPTIONIST', 'ROLE_WAITRESS','ROLE_SPECILIST','ROLE_SUPERVISOR')");
//
////         admin
////        http.authorizeRequests().antMatchers("/goCreate", "/create")
////                .access("hasAnyRole('ROLE_ADMIN')");
//        http.authorizeRequests().antMatchers("/", "/employee","/employee/*")
//                .access("hasAnyRole('ROLE_MANAGER', 'ROLE_DIRECTOR')");
////
//         no permission
        http.exceptionHandling().accessDeniedPage("/403");

//         remember me
        http.rememberMe()
                .rememberMeParameter("rememberMe")
                .rememberMeCookieName("rememberMeCookie")
                .tokenValiditySeconds(60*60*24*365);
//                .tokenRepository(this.persistentTokenRepository());
    }
}
