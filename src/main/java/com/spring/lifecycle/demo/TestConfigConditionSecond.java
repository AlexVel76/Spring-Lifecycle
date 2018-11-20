package com.spring.lifecycle.demo;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class TestConfigConditionSecond implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        System.out.println("---------------Read configuration and check Conditions----------");
        System.out.println("---------------First phase----------");
        Util.getStackInfo(conditionContext.getBeanFactory().getBeanDefinitionNames(), 2);
        return true;
    }
}
