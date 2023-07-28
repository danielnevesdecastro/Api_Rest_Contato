package com.unimed.Agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class AgendaUnimedApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AgendaUnimedApplication.class, args);
	}

}
