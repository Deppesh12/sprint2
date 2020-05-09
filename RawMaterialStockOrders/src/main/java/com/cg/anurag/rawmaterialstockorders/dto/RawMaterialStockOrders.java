package com.cg.anurag.rawmaterialstockorders.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rawmaterialorders")
public class RawMaterialStockOrders 
{
	@Id
	@Column(name="orderid")
	int orderId;
	@Column(name="rawmaterialid")
	String rawMaterialId;
	@Column(name="pricerperunit")
	int pricePerUnit;
	@Column(name="quantityvalue")
	int quantityValue;
	@Column(name="totalprice")
	int totalPrice;
	@Column(name="warehouseid")
	int warehouseId;
	@Column(name="supplierid")
	int supplierId;
	@Column(name="deliverydate")
	LocalDate deliveryDate;
	@Column(name="deliverystatus")
	String deliveryStatus;
	@Column(name="dateoforder")
	LocalDate dateOfOrder;
	
	public RawMaterialStockOrders() {}

	public RawMaterialStockOrders(int orderId, String rawMaterialId, int pricePerUnit, int quantityValue, int totalPrice,
			int warehouseId, int supplierId, LocalDate deliveryDate, String deliveryStatus, LocalDate dateOfOrder) {
		super();
		this.orderId = orderId;
		this.rawMaterialId = rawMaterialId;
		this.pricePerUnit = pricePerUnit;
		this.quantityValue = quantityValue;
		this.totalPrice = totalPrice;
		this.warehouseId = warehouseId;
		this.supplierId = supplierId;
		this.deliveryDate = deliveryDate;
		this.deliveryStatus = deliveryStatus;
		this.dateOfOrder = dateOfOrder;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getRawMaterialId() {
		return rawMaterialId;
	}

	public void setRawMaterialId(String rawMaterialId) {
		this.rawMaterialId = rawMaterialId;
	}

	public int getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getQuantityValue() {
		return quantityValue;
	}

	public void setQuantityValue(int quantityValue) {
		this.quantityValue = quantityValue;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(LocalDate dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	
}

	