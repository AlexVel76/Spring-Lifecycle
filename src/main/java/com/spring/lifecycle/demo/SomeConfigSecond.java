package com.spring.lifecycle.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration()
@Conditional(value = TestConfigConditionSecond.class)
public class SomeConfigSecond {

    @Bean
    public MyBeanSecond myBeanSecond(){
        System.out.println("Create bean MyBeanSecond in " + this.toString() );
        return new MyBeanSecond();
    }

}
