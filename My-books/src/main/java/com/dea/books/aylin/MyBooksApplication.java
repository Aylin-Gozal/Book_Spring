package com.dea.books.aylin;

import com.dea.books.aylin.config.AppConfig;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyBooksApplication {

	public static void main(String[] args) {

//	   ConfigurableApplicationContext context = SpringApplication.run(MyBooksApplication.class, args);

//	   Book book = context.getBean(Book.class);
//	   User user = context.getBean(User.class);
//		System.out.println(book);
//		System.out.println(user);


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//		Book book = context.getBean(Book.class);
//		book.printInfo();


		Library library = context.getBean(Library.class);
		library.showBook();
	}

}
