package com.dbs.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CUSTOMER_NAME")
	private String customerName;

	@Column(name = "ORDER_DATE")
	private String orderDate;

	@Column(name = "SHIPPING_ADDRESS")
	private String shippingAddress;

	@Column(name = "ORDER_ID")
	private String orderId;

	@Column(name = "TOTAL")
	private String total;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

}