<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<style>
</style>
</head>
<body>

	<c:forEach items="${list2}" var="list2">


		<img src="data:image/jpg;base64,${list2.base64}" />

		<c:out value="${list2.product_list}">${list2.product_list}</c:out>

		<c:out value="${list2.quantity}">${list2.quantity}</c:out>

		<c:out value="${list2.description}">${list2.description}</c:out>
				
		    Price: <c:out value="${list2.prize}">${list2.prize}</c:out>

		
		<form
			action="${pageContext.request.contextPath}/final/${list2.product_id}/${list2.prize}/${list2.quantity}">
			<button>Add to Cart</button>
		</form>


	</c:forEach>

</body>
</html>