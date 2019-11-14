package com.websystique.SpringBootCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.websystique.SpringBootCRUD.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = {"com.websystique.SpringBootCRUD"})
public class SpringBootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

}
