package com.example.spring_boot_questions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootQuestionsApplication {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(SpringBootQuestionsApplication.class, args);

        // Retrieve the service
        DataProcessor dataProcessor = context.getBean(DataProcessor.class);

        System.out.println("\n--- Executing DataProcessor ---");

        // Trigger the service method
        dataProcessor.processData("UserReport- 42");

        System.out.println("--- Execution Complete ---");
    }
}


