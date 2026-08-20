package com.Adithya.FirstPro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstProApplication.class, args);
		Alien alien = context.getBean(Alien.class);
		alien.print();
	}

}
