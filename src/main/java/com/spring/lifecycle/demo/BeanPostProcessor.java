package com.spring.lifecycle.demo;

import org.springframework.beans.BeansException;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessor implements org.springframework.beans.factory.config.BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("--------------------------------------");
        System.out.println("----------------5 phase ----------------------");
        System.out.println("For Bean: " + beanName);
        Util.getStackInfo(null, 2);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("--------------------------------------");
        System.out.println("----------------5 phase ----------------------");
        System.out.println("For Bean: " + beanName);
        Util.getStackInfo(null, 2);
        return bean;
    }
}
