package com.cg.anurag.productstock.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.anurag.productstock.dto.ProductStock;
import com.cg.anurag.productstock.service.ProductStockService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController 
public class ProductStockController
{
	@Autowired
	ProductStockService productStockService;
	public void setProductStockService(ProductStockService productStockService)
	{
		this.productStockService=productStockService;
	}
   @PutMapping(value="productstock/addstock",consumes="application/json")
   public ResponseEntity<String> addStock(@RequestBody()ProductStock productStock)
   {
	   String message="Stock Inserted Successfully";
	   if(productStockService.addStock(productStock)==null)
		   message="Stock Insertion Failed";
	   return new ResponseEntity<String>(message,HttpStatus.BAD_REQUEST);
   }
   
  

   
  
}