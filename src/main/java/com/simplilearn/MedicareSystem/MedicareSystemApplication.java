package com.simplilearn.MedicareSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.simplilearn.MedicareSystemApplication"})
public class MedicareSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicareSystemApplication.class, args);
	}

}

