<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Insert title here</title>
<style>
.body{
padding-left:500px;
padding-top:110px;
}
#email{width:500px;height:40px;}
#pass{width:500px;height:40px}
#but{width:500px;height:50px;background-color:red;color:white}
.b1{padding-left:210px}
p{font-size:20px;padding-left:200px}
</style>
</head>
<body>
<div class="body">
<div class="b1">
<img src="${pageContext.request.contextPath}/resources/images/target.png" />
</div>
<p id="p">Sign in</p>
<form:form method="post" action="hello.htm" modelAttribute="signIn">
<form:input type="text" path="email" id="email" placeholder="Email address"/><br>
<p id="pa"></p>
<form:input type="password" path="password" id="pass" placeholder="Create password"/><br>
<p id="pa"></p>
<input type="checkbox"> Keep me signed in</input><br>
<p id="pa"></p>
<input type="button" id="but" value="Sign in"/>
</form:form>   
</div>

</body>
</html>