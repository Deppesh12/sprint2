package com.cg.anurag.inventorymanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductStock {
	 @Id	
	   @Column(name="orderid")
	   String orderId;
	 @Column(name="name")
	 String Name;
	 @Column(name="price_per_uni")
	 double pricePerUnit;
	 @Column(name="quantityvalue")
	 int quantityValue;
	 @Column(name="quantityunit")
	 int quantityUnit;
	 @Column(name="price")
	 double price;
	 @Column(name="warehouseid")
	 String warehouseId;
	 @Column(name="deliverydate")
	 String deliveryDate;
	 @Column(name="manufacturingdate")
	 String manufacturingDate;
	 @Column(name="expirydate")
	 String expiryDate;
	 @Column(name="qualitycheck")
	 String qualityCheck;
	 @Column(name="processdate")
	 String exitDate;
	 public ProductStock() {}
	public ProductStock(String orderId, String name, int quantityValue, double pricePerUnit, int quantityUnit,
			double price, String warehouseId, String deliveryDate, String manufacturingDate, String expiryDate,
			String qualityCheck, String exitDate) {
		super();
		this.orderId = orderId;
		Name = name;
		this.quantityValue = quantityValue;
		this.pricePerUnit = pricePerUnit;
		this.quantityUnit = quantityUnit;
		this.price = price;
		this.warehouseId = warehouseId;
		this.deliveryDate = deliveryDate;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.qualityCheck = qualityCheck;
		this.exitDate = exitDate;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(int quantityValue) {
		this.quantityValue = quantityValue;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public int getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(int quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getQualityCheck() {
		return qualityCheck;
	}
	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}
	public String getExitDate() {
		return exitDate;
	}
	public void setExitDate(String exitDate) {
		this.exitDate = exitDate;
	}


}
