package com.example.training.boot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {
    public final static String BEFORE = "'Before'";
    public final static String AFTER = "'After'";
    public static final Logger LOGGER = LoggerFactory.getLogger(LoginAspect.class);

    @Before("execution(public String com.*.*.*.*.*.getAllUsers())")
    public void beforeMethod(JoinPoint joinPoint) {
        LOGGER.info(BEFORE + " advice implementation - {}; Executing before {}() method"
                , joinPoint.getTarget().getClass(), joinPoint.getSignature().getName());
    }

    @After("execution(public String com.*.*.*.*.*.get*())")
    public void afterMethod(JoinPoint joinPoint) {
        LOGGER.info(AFTER + " advice implementation - {}; Executing After {}() method"
                , joinPoint.getTarget().getClass(), joinPoint.getSignature().getName());
    }
}


