<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
    	<div><tiles:insertAttribute name="header" /></div>        
        <div><tiles:insertAttribute name="body" /></div>    
        <div style="clear:both"><tiles:insertAttribute name="footer" /></div>  
</body>
</html>