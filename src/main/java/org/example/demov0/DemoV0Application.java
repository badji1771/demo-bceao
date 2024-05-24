package org.example.demov0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoV0Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoV0Application.class, args);
	}

	@RequestMapping("/hello")
	public String hello(){
		return "Hello Bceao 24-05-2024 create branch dev !!!";
	}
}
