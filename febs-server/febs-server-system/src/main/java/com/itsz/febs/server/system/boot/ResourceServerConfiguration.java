package com.itsz.febs.server.system.boot;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/eureka/**")
                .and()
                .requestMatchers().antMatchers("/**")
                .and()
                .authorizeRequests().antMatchers("/actuator/**")
                .permitAll()
                .and()
                .authorizeRequests().antMatchers("/**").authenticated();
    }
}
