package com.spring.lifecycle.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("---------------Bean Facroty Post Processor----------");
        System.out.println("---------------Second phase----------");
        Util.getStackInfo(configurableListableBeanFactory.getBeanDefinitionNames(), 2);

        List<String> beansAreNotInContextYet = new ArrayList<>();

        for (String name : configurableListableBeanFactory.getBeanDefinitionNames()) {
            if (configurableListableBeanFactory.isSingleton(name) && configurableListableBeanFactory.containsSingleton(name)) {
                System.out.println("Singleton Bean in context: " + name);
            } else {
                beansAreNotInContextYet.add(name);
            }
        }

        beansAreNotInContextYet.stream().forEach(x -> System.out.println("Beans aren't in context yet: " + x));
    }
}
