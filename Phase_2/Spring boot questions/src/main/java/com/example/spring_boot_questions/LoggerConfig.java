package com.example.spring_boot_questions;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerConfig {

    @Bean
 public LogStrategy fileLogger(){
     return new FileLogger();
 }

    @Bean
    public DataProcessor dataProcessor(@Qualifier("fileLogger") LogStrategy logStrategy) {
        // Spring will automatically look for a single LogStrategy bean to inject here.
        // Since both fileLogger and consoleLogger exist, you must specify which one to use.
        // By changing the parameter to match the bean method name 'fileLogger()',
        // Spring prioritizes that specific bean.
        return new DataProcessor(logStrategy);
    }

}
