package com.cg.anurag.rawmaterialstock.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.anurag.rawmaterialstock.dto.RawMaterialStock;
@Repository
public interface RawMaterialStockDAO extends JpaRepository<RawMaterialStock,Integer>
{

}
