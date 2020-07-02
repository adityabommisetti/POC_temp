package com.dbs.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_ITEM")
public class OrderItemEntity {

	@Id
	private OrderItemId ids;

	@Column(name = "PRODUCT_NAME")
	private String productName;

	@Column(name = "QUANTITY")
	private int quantity;

	public OrderItemId getIds() {
		return ids;
	}

	public void setIds(OrderItemId ids) {
		this.ids = ids;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderItemEntity [ids=" + ids + ", productName=" + productName + ", quantity=" + quantity + "]";
	}
	
	

}