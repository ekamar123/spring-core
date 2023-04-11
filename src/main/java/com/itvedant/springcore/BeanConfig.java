package com.itvedant.springcore;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.itvedant.extra.Book;

@Configuration
public class BeanConfig {
    @Bean
    public LocalDate today(){
        System.out.println("LocalDate Bean Created");
        return LocalDate.now();
    }

    @Bean
    public LocalTime current(){
        System.out.println("LocalTime Bean Created");
        return LocalTime.now();
    }

    @Bean("Book1")
    @Primary
    public Book createBook() {
        System.out.println("Book Object 1 Created by Bean Method");
        return new Book("harry potter", "j k rowling", 900.00);
    }

    @Bean("Book2")
    public Book getBook() {
        System.out.println("Book Object 2 Created by Bean Method");
        return new Book("twilight", "s meyer", 700.00);
    }
}
