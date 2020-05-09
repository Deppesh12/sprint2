package com.cg.anurag.rawmaterialstockorders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class RawMaterialStockOrdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(RawMaterialStockOrdersApplication.class, args);
	}

}
