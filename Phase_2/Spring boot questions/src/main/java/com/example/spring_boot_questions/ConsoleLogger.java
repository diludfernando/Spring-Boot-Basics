package com.example.spring_boot_questions;

import org.springframework.stereotype.Component;

@Component
public class ConsoleLogger implements LogStrategy{

    @Override
    public void log(String message) {
        System.out.println("Console Logger: "+message);
    }



}
