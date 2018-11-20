package com.spring.lifecycle.demo;

import java.util.Arrays;

public class Util {
    public static void getStackInfo(String[] beanDefinitionNames, int lineCount) {
        System.out.println("--------------------------------------------");
        Arrays.stream(new Throwable().getStackTrace()).limit(lineCount).forEach(y -> System.out.println(y));
        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");
        if (beanDefinitionNames != null) {
            System.out.println("Bean definition in bean factory:");
            Arrays.stream(beanDefinitionNames).forEach(x -> System.out.println(x));
            System.out.println("--------------------------------------------");
        }
    }
}
