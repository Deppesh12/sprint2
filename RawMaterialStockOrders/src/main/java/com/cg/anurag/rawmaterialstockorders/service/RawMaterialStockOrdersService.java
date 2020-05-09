package com.cg.anurag.rawmaterialstockorders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.anurag.rawmaterialstockorders.dao.RawMaterialStockOrdersDAO;
import com.cg.anurag.rawmaterialstockorders.dto.RawMaterialStockOrders;
@Service
public class RawMaterialStockOrdersService {
	@Autowired
    RawMaterialStockOrdersDAO rmsdao;
	public void setrmsdao(RawMaterialStockOrdersDAO rmsdao) { this.rmsdao=rmsdao;}
	@Transactional(readOnly=true)
	public RawMaterialStockOrders trackOrder(int orderId)
	{
		return rmsdao.findById(orderId).get();
	}
}
