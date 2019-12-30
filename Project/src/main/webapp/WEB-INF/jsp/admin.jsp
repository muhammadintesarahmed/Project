<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${error eq 'true'}">
${msg}
</c:if>
<form name='loginForm' action="<c:url value='j_spring_security_check' />"
method='POST'>
 
<table>
<tr>
<td>User Name:</td>
<td><input type='text' name='j_username' value=''>
</td>
</tr>
<tr>
<td>Password:</td>
<td><input type='password' name='j_password' />
</td>
</tr>
<tr>
<td><input name="submit" type="submit"
value="submit" />
</td>
</tr>
</table>
 
</form>
</body>
</html>