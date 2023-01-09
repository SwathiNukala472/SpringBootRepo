package com.cts.project3.demo3;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@SpringBootApplication
@RestController
public class Demo3Application {

	public static void main(String[] args) {
		
		/*
		 * SpringApplication app=new SpringApplication(Demo3Application.class);
		 * app.setDefaultProperties(Collections.singletonMap("server.port", 8081));
		 * app.run(args);
		 */
		//http://localhost:8080/actuator
		SpringApplication.run(Demo3Application.class, args);
	}
	
	//http://localhost:8080/hello?name=xyz
	@GetMapping("/hello")
	public String sayHello(@RequestParam(defaultValue = "World") String name) {
		return String.format("Hello %s !!!", name);
	}
	

}
