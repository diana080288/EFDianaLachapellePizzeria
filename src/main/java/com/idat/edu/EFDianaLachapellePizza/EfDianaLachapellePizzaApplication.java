package com.idat.edu.EFDianaLachapellePizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EfDianaLachapellePizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfDianaLachapellePizzaApplication.class, args);
	}

}
