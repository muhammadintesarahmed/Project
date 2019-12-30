package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.sun.org.apache.xml.internal.security.utils.Base64;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue
	@Column
	private int order_id;
	
	@Column
	private int product_id;
	
	@Column
	private int quantity;
	
	@Column
	private String address;
	
	@Column
	private String email;
	
	@Column
	public int prize;
	
	@Column
	public int subTotal;
	
	
	


	

	





	public int getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}


	public Orders() {
		
	}
	

	public int getPrize() {
		return prize;
	}


	public void setPrize(int prize) {
		this.prize = prize;
	}


	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	
	
	
	

}
