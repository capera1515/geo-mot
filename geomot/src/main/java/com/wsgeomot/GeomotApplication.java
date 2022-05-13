package com.wsgeomot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.wsgeomot")
public class GeomotApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeomotApplication.class, args);
	}

}
