<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Target</title>
<style>
#men{
padding-top:80px;
padding-left:60px;
}
#women{
padding-top:80px;
padding-left:120px;
}
#kids{
padding-top:80px;
padding-left:180px;
}
</style>
</head>
<body>
	  <a href="products/men"><img id="men" src="${pageContext.request.contextPath}/resources/images/men.jfif"/></a>
<a href="products1/women"><img id="women" src="${pageContext.request.contextPath}/resources/images/women.jfif"/></a> 
<a href="#"><img id="kids" src="${pageContext.request.contextPath}/resources/images/kids.jfif"/></a> 
	  
	 
	
   

</body>
</html>