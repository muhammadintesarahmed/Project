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

<form name='loginForm' action="<c:url value='/j_spring_security_check' />"
method='POST' role='form'>
<c:if test="${error eq 'true'}">
${msg}
</c:if> 
<table>
<tr>
<td>User Name:</td>
<td><input type='text' name='username' />
</td>
</tr>
<tr>
<td>Password:</td>
<td><input type='password' name='password' />
</td>
</tr>
<tr>
<td><input name="submit" type="submit"
value="submit" />
</td>
</tr>
</table>
 <input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
</form>
</body>
</html>