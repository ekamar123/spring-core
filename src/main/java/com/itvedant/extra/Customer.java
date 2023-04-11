package com.itvedant.extra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private Book book;
    private Student student;
    //Constructor Based Dependency Injection
    @Autowired
    public Customer(@Qualifier("Book2") Book book){
        System.out.println("Customer Object Created");
        this.book = book;
    }

    public void checkBook(){
        System.out.println(this.book);
    }

    //Setter Based Dependency Injection
    @Autowired
    public void setStudent(Student student){
        this.student = student;
    }
}
