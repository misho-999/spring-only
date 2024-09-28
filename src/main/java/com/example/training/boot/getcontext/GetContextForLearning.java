package com.example.training.boot.getcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class GetContextForLearning {

    private final ApplicationContext applicationContext;

    public GetContextForLearning(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        boolean testRestTemplate = applicationContext.containsBean("dataSource");
        System.out.println();
    }
}
