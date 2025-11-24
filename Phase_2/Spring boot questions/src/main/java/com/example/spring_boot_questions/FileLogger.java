package com.example.spring_boot_questions;

public class FileLogger implements LogStrategy{

    @Override
    public void log(String message){
        System.out.println("File Logger: "+message);
    }

}
