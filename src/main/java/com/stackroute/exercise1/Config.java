package com.stackroute.exercise1;

import com.stackroute.exercise1.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stackroute.exercise1")
class Config {

    @Bean
    public User user(){

        return new User(1,"NEELANSHI");
    }
}