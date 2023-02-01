<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>

<style>
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

<<script type="text/javascript">
function validateUserName(){
	var userName =  document.getElementById('yn').value;
	if (userName.length < 3){
		alert("Enter The Details");
		return false;
	}
	else{
		return true;
	}
} 
</script> 

</head>
<body>

<h1 align="center">Love Calculater</h1><hr>
<form:form action="process-homepage" method="get" modelAttribute="userInfo" >
<div align="center">
<p>
<label for="yn">Your Name :</label>
<form:input id="yn" path="userName" />
<form:errors path="userName" cssClass="error"/>
</p>
<p>
<label for="cn">Crush Name :</label>
<form:input id="cn" path="crushName" />
<form:errors path="crushName" cssClass="error"/>
</p>
<p>
<form:checkbox path="termAndCondition" id="check"/>
<label>I am agreeing that this is for fun </label>
<form:errors path="termAndCondition" cssClass="error"></form:errors>
</p>
<input type="submit" value="Calculate">
</div>
</form:form>


<!-- malleshwaram 5cross ramanuja plaza 1 flore bangalore.
10.30am BE 
appsourse
java developer  -->


</body>
</html>