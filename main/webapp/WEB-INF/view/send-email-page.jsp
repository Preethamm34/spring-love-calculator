<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Send Email</title>
</head>
<body>

<h1 align="center">Love Calculator</h1>
<h1 align="center">{ FLAMES }</h1>
<hr>

<h1>Hi, ${userInfo.userName}</h1>
<h2>Send Result to Your Email</h2>

<form:form action="process-email" method="get" modelAttribute="emailDTO"> 

<label>Enter Your Email :</label>
<form:input path="userEmail"/>
<input type="submit" value="Send">
</form:form>

</body>
</html>