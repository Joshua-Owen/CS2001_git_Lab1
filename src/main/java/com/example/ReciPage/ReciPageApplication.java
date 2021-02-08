package com.example.ReciPage;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ReciPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReciPageApplication.class, args);
	}
	

}
