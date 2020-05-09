package com.cg.anurag.rawmaterialstock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.anurag.rawmaterialstock.dto.RawMaterialStock;
import com.cg.anurag.rawmaterialstock.service.RawMaterialStockService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RawMaterialStockController {
 

		@Autowired
		RawMaterialStockService rawMaterialStockService;
		public void setRawMaterialStockService(RawMaterialStockService rawMaterialStockService)
		{
			this.rawMaterialStockService=rawMaterialStockService;
		}
	   @PutMapping(value="rawmaterial/addStock",consumes="application/json")
	   public ResponseEntity<String> addStock(@RequestBody()RawMaterialStock rawMaterialStock)
	   {
		   String message="Stock Inserted Successfully";
		   if(rawMaterialStockService.addStock(rawMaterialStock)==null)
			   message="Stock Insertion Failed";
		   return new ResponseEntity<String>(message,HttpStatus.BAD_REQUEST);
	   }
}

