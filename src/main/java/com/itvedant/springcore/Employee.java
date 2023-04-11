package com.itvedant.springcore;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
    public Employee(){
        System.out.println("Employee Object Created");
    }

    public void working(){
        System.out.println("Employee is working");
    }
}
