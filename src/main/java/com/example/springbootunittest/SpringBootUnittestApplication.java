package com.example.springbootunittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootUnittestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUnittestApplication.class, args);
	}
}
