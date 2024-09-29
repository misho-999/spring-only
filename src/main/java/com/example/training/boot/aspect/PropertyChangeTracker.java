package com.example.training.boot.aspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PropertyChangeTracker {
    // creating a logger
    public static final Logger logger = LoggerFactory.getLogger(PropertyChangeTracker.class);

    @Before("execution(void set*(*))")
    public void trackChange() {
        System.out.print("");
        logger.info("Property about to change...");
    }
}
