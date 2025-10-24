package com.dea.books.aylin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.dea.books.aylin")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
