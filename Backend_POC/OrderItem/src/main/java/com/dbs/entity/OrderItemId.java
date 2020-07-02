package com.dbs.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderItemId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 498584354253911013L;

	@Column(name = "ORDER_ID")
	private int orderId;

	@Column(name = "PRODUCT_CODE")
	private String productCode;

	@Override
	public String toString() {
		return "OrderItemId [orderId=" + orderId + ", productCode=" + productCode + "]";
	}

	public int getOrderId() {
		return orderId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderId;
		result = prime * result + ((productCode == null) ? 0 : productCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemId other = (OrderItemId) obj;
		if (orderId != other.orderId)
			return false;
		if (productCode == null) {
			if (other.productCode != null)
				return false;
		} else if (!productCode.equals(other.productCode))
			return false;
		return true;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
