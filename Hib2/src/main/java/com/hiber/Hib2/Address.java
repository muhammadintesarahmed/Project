package com.hiber.Hib2;

public class Address {
private int aid;
private String addressline;
private String city;
private String state;
private String country;
private Employee employee;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAddressline() {
	return addressline;
}
public void setAddressline(String addressline) {
	this.addressline = addressline;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}


}
