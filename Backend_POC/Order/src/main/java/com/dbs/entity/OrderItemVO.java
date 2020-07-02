package com.dbs.entity;

public class OrderItemVO {
	private int orderId;
	private String productCode;
	private String productName;
	private int quantity;

	public int getOrderId() {
		return orderId;
	}

	public String getProductCode() {
		return productCode;
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
