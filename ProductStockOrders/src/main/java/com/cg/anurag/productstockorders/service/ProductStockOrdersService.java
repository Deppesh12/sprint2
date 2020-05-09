package com.cg.anurag.productstockorders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.anurag.productstockorders.dao.ProductStockOrdersDAO;
import com.cg.anurag.productstockorders.dto.ProductStockOrders;
@Service
public class ProductStockOrdersService {
	@Autowired
    ProductStockOrdersDAO psdao;
	public void setpsdao(ProductStockOrdersDAO psdao) { this.psdao=psdao;}
	@Transactional(readOnly=true)
	public ProductStockOrders trackOrder(int orderId)
	{
		return psdao.findById(orderId).get();
	}
}
