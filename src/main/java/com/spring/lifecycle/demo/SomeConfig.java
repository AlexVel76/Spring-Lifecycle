package com.spring.lifecycle.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration()
@Conditional(value = TestConfigCondition.class)
public class SomeConfig {

    @Autowired
    private ApplicationContext applicationContext;


}
