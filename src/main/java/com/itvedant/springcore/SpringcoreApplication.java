package com.itvedant.springcore;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.itvedant.extra.Book;
import com.itvedant.extra.Customer;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itvedant.*"})
public class SpringcoreApplication implements CommandLineRunner{
	@Autowired
	Employee employee; //injection

	@Autowired
	LocalDate date;

	@Autowired 
	Book book1;

	@Autowired
	@Qualifier("Book2")
	Book book2;

	@Autowired
	Customer cust;

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employee.working();
		System.out.println("Today is " + date);
		System.out.println(book1);
		System.out.println(book2);
		cust.checkBook();
	}
}
