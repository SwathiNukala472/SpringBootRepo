package com.cts.webservices.demo6;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo6Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo6Application.class, args);
	}
	/*
	 * @Bean CommandLineRunner init(StorageService storageService) { return (args)
	 * -> { storageService.deleteAll(); storageService.init(); }; }
	 */

}
