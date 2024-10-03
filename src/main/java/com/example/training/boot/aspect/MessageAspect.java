package com.example.training.boot.aspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspect {
    // creating a logger
    public static final Logger logger = LoggerFactory.getLogger(MessageAspect.class);

//    @Before("execution(void set*(*))")
//    public void trackChange() {
//        System.out.print("");
//        logger.info("Property about to change...");
//    }


    @Before("execution(* com.example.training.boot.controller.UserController.getAllUsers())")
    public void beforeMethod() {
        System.out.println("before method");
        logger.info("...........LOGGER...................");
    }
}
