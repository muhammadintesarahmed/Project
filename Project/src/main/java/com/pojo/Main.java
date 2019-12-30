package com.pojo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.sun.org.apache.xml.internal.security.utils.Base64;

@Entity
@Table(name="details")
public class Main {

@Id
@GeneratedValue
@Column
private int product_id;
@Column
private String product_list;
@Column
private int quantity;
@Column
private int prize;//price
@Column
private String description;
@Column
private String product_type;
@Column
private byte[] image;

private String base64;

public Main() {
	
}

@Transient
public String getBase64() {
	return this.base64 = Base64.encode(this.image);
}
public void setBase64(String base64Image) {
	this.base64 = base64Image;
}
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public String getProduct_list() {
	return product_list;
}
public void setProduct_list(String product_list) {
	this.product_list = product_list;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getPrize() {
	return prize;
}
public void setPrize(int prize) {
	this.prize = prize;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getProduct_type() {
	return product_type;
}
public void setProduct_type(String product_type) {
	this.product_type = product_type;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}



}
