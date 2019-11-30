<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Insert title here</title>
<style>
.footer{
 position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   height:170px;
   text-align: center;
   background-color:#f9f9f9;
   button-color:#f9f9f9;	
}
#para{font-size:12px;}
#bold1{font-size:13px;}
</style>
</head>
<body>
<div class="footer">

		<button class="drop" ><a  href="#">Help</a>
		</button>
		<button class="drop" ><a href="#">Stores</a>
		</button>
		<button class="drop" ><a href="#">Apps</a>
		</button>
		<button class="drop" ><a href="#">Social</a>
		</button>
		<button class="drop" ><a href="#">More</a>
		</button>
	<P id="para">RecallsTermsInterest-Based AdsCA Privacy RightsCA Supply Chain ActPrivacy™ & © 2019 Target Brands, Inc.</p>
	<img src="${pageContext.request.contextPath}/resources/images/target1.png"/><br>
	<b id="bold1">Expect More. Pay Less</b>

</div>
</body>
</html>