<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
.body {
	padding-left: 500px;
	padding-top: 70px;
}

#email {
	width: 500px;
	height: 40px;
}

#name {
	width: 500px;
	height: 40px
}

#lname {
	width: 500px;
	height: 40px
}

#num {
	width: 500px;
	height: 40px
}

#pass {
	width: 500px;
	height: 40px
}

#but {
	width: 500px;
	height: 50px
}

#pa {
	height: 0px
}

#p {
	font-size: 20px;
	padding-left: 160px
}

.b1 {
	padding-left: 210px
}
</style>
</head>
<body>
	<form:form method="post" action="signIn" modelAttribute="createAccount">
		<div class="body">
			<div class="b1">
				<img
					src="${pageContext.request.contextPath}/resources/images/target.png" />
			</div>
			<p id="p">Create account</p>
			<form:input path="email" type="text" id="email"
				placeholder="Email address" />
			<br>
			<p id="pa"></p>
			<form:input path="firstName" type="text" id="name"
				placeholder="First name" />
			<br>
			<p id="pa"></p>
			<form:input path="lastName" type="text" id="lname"
				placeholder="Last name" />
			<br>
			<p id="pa"></p>
			<form:input path="mobileNumber" type="text" id="num"
				placeholder="Mobile phone number(optional)" />
			<br>
			<p id="pa"></p>
			<form:input path="password" type="password" id="pass"
				placeholder="Create password" />
			<br>
			<p id="pa"></p>
			<input type="submit" id="but" value="Create account" />
		</div>
	</form:form>
</body>
</html>