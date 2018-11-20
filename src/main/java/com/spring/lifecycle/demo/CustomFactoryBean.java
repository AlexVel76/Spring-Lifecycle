package com.spring.lifecycle.demo;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class CustomFactoryBean implements FactoryBean<MyBean> {

    @Override
    public MyBean getObject() throws Exception {
        System.out.println("---------------- Bean Creation --------------------");
        System.out.println("------------4 phase----------------------- ");
        Util.getStackInfo(null, 2);
        return new MyBean();
    }

    @Override
    public Class<?> getObjectType() {
        return MyBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
