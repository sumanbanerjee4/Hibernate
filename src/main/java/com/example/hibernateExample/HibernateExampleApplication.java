package com.example.hibernateExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateExampleApplication implements CommandLineRunner{
	
	 @Autowired
	   MenuService menuService;
	 

	public static void main(String[] args) {
		SpringApplication.run(HibernateExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		menuService.addMenu();
		
	}
}
