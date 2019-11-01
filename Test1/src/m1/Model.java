package m1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.DAO;


public class Model {


Statement stmt=null;
ResultSet res=null;
PreparedStatement pstmt=null;
public int id;
public String name;
public int aid;
public int mid;
public int orderid;
public String city;
public String state;
public int zip;
public int mobilenumber;
public int orderdate;
public String cid;
public String cpass;

public void setCid(String cid) {
	this.cid = cid;
}
public void setCpass(String cpass) {
	this.cpass = cpass;
}
public String getCid() {
	return cid;
}
public String getCpass() {
	return cpass;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setAid(int aid) {
	this.aid = aid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public void setCity(String city) {
	this.city = city;
}
public void setState(String state) {
	this.state = state;
}
public void setZip(int zip) {
	this.zip = zip;
}
public void setMobilenumber(int mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public void setOrderdate(int orderdate) {
	this.orderdate = orderdate;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public int getAid() {
	return aid;
}
public int getMid() {
	return mid;
}
public int getOrderid() {
	return orderid;
}
public String getCity() {
	return city;
}
public String getState() {
	return state;
}
public int getZip() {
	return zip;
}
public int getMobilenumber() {
	return mobilenumber;
}
public int getOrderdate() {
	return orderdate;
}
public static Connection getConnection(){
	Connection con=null;
	try {
		//Class.forName("com.mysql.jdbc.Driver");
		//System.out.println("driver loaded");
		con= DAO.getConnection();
		System.out.println("conn estd");
		return con;
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return con; 
}
public boolean login(){
	String s="select * from customer where cid=? and cpass=?";
	try {
       Connection con=getConnection();	
		System.out.println(con);
	    pstmt=con.prepareStatement(s);
		pstmt.setString(1,cid);
		pstmt.setString(2,cpass);
		res=pstmt.executeQuery();
		if(res.next()){
			return true;
		}
		else
			return false;
	} catch(Exception e) {
		System.out.println(e.getMessage());
	} 
	return false;
	
}
public boolean insert(){
	String s="insert into customer (name,cid,cpass) values(?,?,?)";
	try {
		  Connection con=getConnection();	
		pstmt=con.prepareStatement(s);
		pstmt.setString(1, name);
		pstmt.setString(2, cid);
		pstmt.setString(3, cpass);
		int x=pstmt.executeUpdate();
		if(x>0){
			return true;
		}else
			return false;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	return false;
	
}
/*public void read(){
	String s="select * from customer where cid=?";
	  Connection con=getConnection();
	try {
		pstmt=con.prepareStatement(s);
		res=pstmt.executeQuery();
		if(res.next()){
			int a=res.getInt(1);
			String b=res.getString(2);
			int c=res.getInt(3);
			int d=res.getInt(4);
			int e=res.getInt(5);
			String f=res.getString(6);
			String g=res.getString(7);
			System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}*/
	
	

public boolean update(){
	String s="update customer set name=? where cid=?";
	 Connection con=getConnection();
	 try {
		pstmt=con.prepareStatement(s);
		pstmt.setString(1, name);
		pstmt.setString(2, cid);
		int x;
		System.out.println( x=pstmt.executeUpdate());
		
		if(x>0){
			return true;}
		
		else 
		{return false;}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
	e.printStackTrace();
	}
	 
	return false;
	
}
public boolean delete(){
	String s="delete from customer where cid=?";
	 Connection con=getConnection();
	 try {
		pstmt=con.prepareStatement(s);
		pstmt.setString(1, cid);
		int x=pstmt.executeUpdate();
		if(x>0){
			return true;}
		else {return false;}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	 
}
}
