package com.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans(value = { @ComponentScan })

public class SpringBootImageUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootImageUploadApplication.class, args);
	}
}
