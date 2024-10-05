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
    public static final Logger LOGGER = LoggerFactory.getLogger(LoginAspect.class);

    public final static String BEFORE = "@Before";
    public final static String AFTER = "@After";
    public static final String LOG_MESSAGE = """
                            
            {} advice implementation;
            Target class name: {};
            JointPoint method signature name: {}""";

    @Before("execution(public * com.*.*.*.*.*.getAll*())")
    public void beforeMethod(JoinPoint joinPoint) {
        LOGGER.info(LOG_MESSAGE, BEFORE, joinPoint.getTarget().getClass(), joinPoint.getSignature().getName());
    }

    //Here We pass exactly teh return type wile card *
    @After("execution(public * com.*.*.*.*.*.getAll*())")
    public void afterMethod(JoinPoint joinPoint) {
        LOGGER.info(LOG_MESSAGE , AFTER, joinPoint.getTarget().getClass(), joinPoint.getSignature().getName());
    }

    //Here We pass exactly teh return type List<User>
    @Before("execution(public * com.example.*.boot.*.impl.UserServiceImpl.findAll*())")
    public void afterInitUsers(JoinPoint joinPoint) {
        LOGGER.info(LOG_MESSAGE , BEFORE, joinPoint.getTarget().getClass(), joinPoint.getSignature().getName());
    }
}


