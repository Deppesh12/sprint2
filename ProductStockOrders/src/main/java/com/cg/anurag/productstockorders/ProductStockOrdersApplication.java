package com.cg.anurag.productstockorders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ProductStockOrdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductStockOrdersApplication.class, args);
	}

}
