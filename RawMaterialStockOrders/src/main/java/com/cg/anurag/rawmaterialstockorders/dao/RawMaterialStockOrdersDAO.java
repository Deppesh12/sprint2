package com.cg.anurag.rawmaterialstockorders.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.anurag.rawmaterialstockorders.dto.RawMaterialStockOrders;

@Repository
public interface RawMaterialStockOrdersDAO extends JpaRepository<RawMaterialStockOrders,Integer>
{

}