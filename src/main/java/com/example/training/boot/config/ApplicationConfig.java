package com.example.training.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DataSourceConfigDev.class, DataSourceConfigTest.class, WebConfig.class, AspectConfig.class})
public class ApplicationConfig {
    /* @Import Combines multiple Configuration
    In this example we see 3 configuration files. ApplicationConfig, DataSou’rceConfig, WebConfig and AspectConfig */

}
