package com.example.spring_boot_questions;

import org.springframework.beans.factory.annotation.Qualifier;

public class DataProcessor {

    private final LogStrategy logStrategy;

    public DataProcessor(LogStrategy logStrategy) {
        this.logStrategy = logStrategy;
        System.out.println("--- DataProcessor initialized ---");
    }

    public void processData(String data) {
        System.out.println("Processing data: " + data);
        logStrategy.log("Data processing comple for: "+ data);
    }

}
