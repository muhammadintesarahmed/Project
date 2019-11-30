<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Insert title here</title>
<style>
.header{	
background-color:#E80018;
width:100%;
height:90px;
margin-top:-15px;
}
.dropdown{
  padding-left:70px;
  padding-top:20px;
  overflow: hidden;
}
.dropdown .dropbtn {
  cursor: pointer;
  font-size: 17px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}
#a{color:white}
.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}
.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}
.show {
  display: block;
}
</style>
</head>
<body>
<div class="header">
	
	<div class="dropdown">
		<img src="${pageContext.request.contextPath}/resources/images/target.png"/>
		<button class="dropbtn" onclick="myFunction()">Categories
		</button>
		<button class="dropbtn" ><a href="#" id="a">Deals</a>
		</button>
		<button class="dropbtn" ><a href="#" id="a">Gifting</a>
		</button>
		<button class="dropbtn" ><a href="#" id="a">Same Day Delivery</a>
		</button>
    
    <div class="dropdown-content" id="myDropdown">
		<a href="#">Men's</a>
		<a href="#">Women's</a>
		<a href="#">Kid's</a>
	</div>
	<input class="w3-panel w3-round-xxlarge w3-teal" style="width:40%" type="text" placeholder="Search"/>
	
	&nbsp;&nbsp;<input type="image" class="dropbtn1" src="${pageContext.request.contextPath}/resources/images/tar.jfif"/>
		<a href="signInForm">Sign In</a>
		<a href="createAccountForm">Create Account</a>
	

	</div>
	
</div>

 <script>
/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}



// Close the dropdown if the user clicks outside of it
window.onclick = function(e) {
  if (!e.target.matches('.dropbtn')) {
  var myDropdown = document.getElementById("myDropdown");
    if (myDropdown.classList.contains('show')) {
      myDropdown.classList.remove('show');
    }
  }
}


</script>


</body>
</html>