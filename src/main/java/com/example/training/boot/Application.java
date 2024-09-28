package com.example.training.boot;

import com.example.training.boot.config.ApplicationConfig;
import com.example.training.boot.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class);

        /* There is multiple options for accessing Bean

         !!!Only one profile should be activated at a time.!!!
         * When do test comment unused profile datasource. Uncomment only used !!!
         * Profile dev => has hardcoded values
         * Profile test => gets values from application.properties file!!!
         * */

        //1. Use bean id, a cast is needed
        DataSource dataSource1 = (DataSource) context.getBean("dataSource");

        //2. Use typed method to avoid casting
        DataSource dataSource2 = context.getBean("dataSource", DataSource.class);

        //3. No need for bean ID if type is unique - recommended (use type whenever possible)
        DataSource dataSource3 = context.getBean(DataSource.class);

        ApplicationConfig applicationConfig = context.getBean(ApplicationConfig.class);
        WebConfig webConfig = context.getBean(WebConfig.class);

        //Test Scope Prototype
        String testPrototype1 = context.getBean("testPrototype", String.class);
        String testPrototype2 = context.getBean("testPrototype", String.class);
        boolean testPrototype = testPrototype1 == testPrototype2;   //false


        boolean bean = context.containsBean("testService");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}