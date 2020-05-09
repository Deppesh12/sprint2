package com.cg.anurag.productstockorders.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.cg.anurag.productstockorders.dto.ProductStockOrders;
import com.cg.anurag.productstockorders.service.ProductStockOrdersService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController 
public class ProductStockOrdersController
{
	@Autowired
	ProductStockOrdersService productStockOrdersService;
	public void setProductStockOrdersService(ProductStockOrdersService productStockOrdersService)
	{
		this.productStockOrdersService=productStockOrdersService;
	}
	 @GetMapping("productstock/trackOrder/{orderId}")
	   public ProductStockOrders trackOrder(@PathVariable int orderId)
	   {
		   return productStockOrdersService.trackOrder(orderId);
	   }

}