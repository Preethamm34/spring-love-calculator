<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Sucess</title>

</head>
<body> 

<h1 align="center">Love Calculater</h1>
<h1 align="center">{ FLAMES }</h1><hr>


<h2>The Details Entered By You Are :</h2>
Name :${userRegistration.name}<br>
User Name :${userRegistration.userName}<br>
Gender :${userRegistration.gender}<br>
Age : ${userRegistration.age}<br>
Password 	:${userRegistration.password}<br>
Country :${userRegistration.contryName}<br>
Hobbies :
<c:forEach var="temp" items="${userRegistration.hobbies}">${temp}</c:forEach><br> 
Email ID : ${userRegistration.communicationDTO.email}<br>
Phone Number : ${userRegistration.communicationDTO.phone}<br>

</body>
</html>