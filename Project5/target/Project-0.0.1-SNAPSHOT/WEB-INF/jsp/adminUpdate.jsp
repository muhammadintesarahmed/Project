<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>need to add table</h1>
<form name="logout" action="<c:url value='/j_spring_security_logout' />" method='POST' role='form'>
<input type="submit" value="logout"/>
 <input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
</form>
</body>
</html>