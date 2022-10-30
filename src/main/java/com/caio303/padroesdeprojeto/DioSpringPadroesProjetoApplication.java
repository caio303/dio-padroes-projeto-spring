package com.caio303.padroesdeprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DioSpringPadroesProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioSpringPadroesProjetoApplication.class, args);
	}

}
