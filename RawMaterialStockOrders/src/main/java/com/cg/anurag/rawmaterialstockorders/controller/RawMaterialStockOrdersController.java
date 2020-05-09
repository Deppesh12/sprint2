package com.cg.anurag.rawmaterialstockorders.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.cg.anurag.rawmaterialstockorders.dto.RawMaterialStockOrders;
import com.cg.anurag.rawmaterialstockorders.service.RawMaterialStockOrdersService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController 
public class RawMaterialStockOrdersController
{
	@Autowired
	RawMaterialStockOrdersService rawMaterialStockOrdersService;
	public void setRawMaterialStockOrdersService(RawMaterialStockOrdersService rawMaterialStockOrdersService)
	{
		this.rawMaterialStockOrdersService=rawMaterialStockOrdersService;
	}
	 @GetMapping("rawmaterial/trackOrder/{orderId}")
	   public RawMaterialStockOrders trackOrder(@PathVariable int orderId)
	   {
		   return rawMaterialStockOrdersService.trackOrder(orderId);
	   }

}