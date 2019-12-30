<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>men</title>
</head>
<body>

	<c:forEach items="${list}" var="list">
		<a href="${pageContext.request.contextPath}/productdisplay/${list.product_id}">
		<img src="data:image/jpg;base64,${list.base64}" /></a>
		
		Type:<c:out value="${list.product_type }">${list.product_type }</c:out>
		Category:<c:out value="${list.product_list}">${list.product_list}</c:out>

		Quantity:<c:out value="${list.quantity}">${list.quantity}</c:out>

		Description:<c:out value="${list.description}">${list.description}</c:out>
				
		    Price: <c:out value="${list.prize}">${list.prize}</c:out>
		    
		
	</c:forEach>

</body>
</html>