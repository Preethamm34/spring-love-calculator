<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>

<style>
#result {
	color: red;
	font-size: 20px;
}
</style>

</head>
<body>

	<h1 align="center">Love Calculator</h1>
	<h1 align="center">{ FLAMES }</h1>
	<hr>
	<hr>

	<h2>The Love Calculator Predicts :</h2>
	<p>
		<span id="result">${userInfo.userName}</span> & <span id="result">${userInfo.crushName}</span>
		are
	</p>
	<br>

	<span id="result">${userInfo.result} </span>
	<br>

	<!--  <h3><b> ${result} </b></h3>
-->
	<br>
	
	
<!--  	 <a href="/spring-love-calculator/sendEmail">Send result to your
		Email</a>
-->
<!-- c : url step  -->
<a href="<c:url value="/sendEmail" />">Send result to your
		Email</a>



</body>
</html>