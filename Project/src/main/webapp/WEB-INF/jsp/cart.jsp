<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>

	<form:form  method="post" action="${pageContext.request.contextPath}/final/order" modelAttribute="cart">
<%-- 	Product_id:<c:out value="${cart.product_id}">${cart.product_id}</c:out><br>
	Price:     <c:out value="${cart.prize}">${cart.prize}</c:out><br> --%>
	<table>
	 <tr><td>	Quantity: </tr></td><tr><td><form:select path="quantity"><form:option value="1"></form:option><form:option value="2"></form:option>
	 <form:option value="3"></form:option><form:option value="4"></form:option><form:option value="5"></form:option>
	 
	 </form:select></td></tr><br>
	 <tr><td> Address: </tr></td><tr><td> <form:input path="address" type="text" id="address"
		placeholder="address" /></td></tr> <br>
     <tr><td> 	Email:   </tr></td><tr><td>  <form:input path="email" type="text" id="email"
		placeholder="Email address" /></td></tr> <br> 
	 <tr><td> Product_id: </tr></td><tr><td><form:input path="product_id" type="text" id="productid"
		placeholder="Product_id" /></td></tr> <br> 
	 <tr><td> price: </tr></td><tr><td><form:input path="prize" type="text" id="price"
		placeholder="price" /></td></tr><br> 
     <tr><td><button>place order</button></td></tr>
     </table>
</form:form>
</body>
</html>