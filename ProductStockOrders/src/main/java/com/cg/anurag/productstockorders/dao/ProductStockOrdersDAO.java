package com.cg.anurag.productstockorders.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.anurag.productstockorders.dto.ProductStockOrders;

@Repository
public interface ProductStockOrdersDAO extends JpaRepository<ProductStockOrders,Integer>
{

}