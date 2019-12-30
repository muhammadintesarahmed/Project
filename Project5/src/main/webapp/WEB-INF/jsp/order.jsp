<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE>
<html>
<head>
<meta  />
<title>Insert title here</title>
</head>
<body>
<h1>OrderPlaced</h1>
<table>
<form:form>
<tr><td>Email:<c:out value="${cart.email}">${cart.email}</c:out></td></tr>
<tr><td>Address:<c:out value="${cart.address}">${cart.address}</c:out></td></tr>
<tr><td>Quantity:<c:out value="${cart.quantity}">${cart.quantity}</c:out></td></tr>
<tr><td>Product_id:<c:out value="${cart.product_id}">${cart.product_id}</c:out></td></tr>
<tr><td>Price:<c:out value="${cart.prize}">${cart.prize}</c:out></td></tr>
<tr><td>Order_id:<c:out value="${cart.order_id}">${cart.order_id}</c:out></td></tr>
<tr><td>subTotal:<c:out value="${cart.subTotal}">${cart.subTotal}</c:out></td></tr>
</form:form>
</table>

<a href="${pageContext.request.contextPath}/hello.htm"><button>go back shopping</button></a>
		
</body>
</html>