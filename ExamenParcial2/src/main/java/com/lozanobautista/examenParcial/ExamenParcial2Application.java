package com.lozanobautista.examenParcial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ExamenParcial2Application {

	public static void main(String[] args) {
		SpringApplication.run(ExamenParcial2Application.class, args);
	}

}
