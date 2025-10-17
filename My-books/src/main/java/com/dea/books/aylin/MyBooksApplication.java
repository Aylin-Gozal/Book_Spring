package com.dea.books.aylin;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyBooksApplication {

	public static void main(String[] args) {

	   ConfigurableApplicationContext context = SpringApplication.run(MyBooksApplication.class, args);

	   Book book = context.getBean(Book.class);
		System.out.println(book);
	}

}
