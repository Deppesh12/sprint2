package com.cg.anurag.productstock.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.anurag.productstock.dto.ProductStock;

@Repository
public interface ProductStockDAO extends JpaRepository<ProductStock,Integer>
{

}
