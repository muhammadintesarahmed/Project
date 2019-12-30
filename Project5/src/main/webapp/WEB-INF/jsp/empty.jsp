<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<c:forEach items="${order}" var="order">
<tr><td>Email:<c:out value="${order.email}">${order.email}</c:out></td>
<td>Address:<c:out value="${order.address}">${order.address}</c:out></td>
<td>Quantity:<c:out value="${order.quantity}">${order.quantity}</c:out></td>
<td>Product_id:<c:out value="${order.product_id}">${order.product_id}</c:out></td>
<td>Price:<c:out value="${order.prize}">${order.prize}</c:out></td>
<td>Order_id:<c:out value="${order.order_id}">${order.order_id}</c:out></td>
<td>subTotal:<c:out value="${order.subTotal}">${order.subTotal}</c:out></td>
<td><a href="${pageContext.request.contextPath}/delete/${order.order_id}"><button>Delete</button></a></td>
</tr>

</c:forEach>

</table>

</body>
</html>