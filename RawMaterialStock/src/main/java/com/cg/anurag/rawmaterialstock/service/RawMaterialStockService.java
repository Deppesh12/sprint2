package com.cg.anurag.rawmaterialstock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cg.anurag.rawmaterialstock.dao.RawMaterialStockDAO;
import com.cg.anurag.rawmaterialstock.dto.RawMaterialStock;
@Service
public class RawMaterialStockService {
	@Autowired
	RawMaterialStockDAO rmsdao;
	public void setpsdao(RawMaterialStockDAO psdao) { this.rmsdao=rmsdao;}
	 @Transactional
	public RawMaterialStock addStock(RawMaterialStock rawMaterialStock)
	 {
		 return rmsdao.save(rawMaterialStock);
	 }
		 
}
