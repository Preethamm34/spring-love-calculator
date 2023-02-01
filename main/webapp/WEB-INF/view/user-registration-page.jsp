<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
label{
width: 110px;
display: inline-block;
text-align: left;
height: 30px;
}
#ur{

}
</style>
</head>
<body>

	<h1 align="center">Love Calculater</h1>
	<h1 align="center">{ FLAMES }</h1>
	<hr>
	<h2 align="">Please Register Here</h2>

	<form:form id="ur" action="registration-sucess" method="get" modelAttribute="userRegistration">
		<div align="">
			<label>Name :</label>
			<form:input path="name" />
			<form:errors path="name" cssClass="error"/>
			<br> 
			<label>User Name :</label>
			<form:input path="userName" />
			<form:errors path="userName" cssClass="error" />
			<br>
			<label>Gender :</label>
			Male<form:radiobutton path="gender" value="Male"/>
			Female<form:radiobutton path="gender" value="Female"/>
			<br> 
			<label>Age :</label>
			<form:input path="age"/>
			<form:errors path="age" cssClass="error"/>
			<br>
			<label>Password :</label>
			<form:password path="password" />
			<br>
			 <label>Country :</label>
			<form:select path="contryName">
			<form:option value="spain" label="Spain"></form:option>
			<form:option value="brazil" label="Brazil"></form:option>
			<form:option value="england" label="England"></form:option>
			<form:option value="india" label="India"></form:option>
			<form:option value="usa" label="Unites States of America"></form:option>
			</form:select>
			<br> 
			 <label>Hobbies :</label>
			 Cricket : <form:checkbox path="hobbies" value="cricket"/>
			 Football : <form:checkbox path="hobbies" value="football"/>
			 Swimming : <form:checkbox path="hobbies" value="swimming"/>
			 Gym Workout : <form:checkbox path="hobbies" value="gymWorkout"/>
			 Travelling : <form:checkbox path="hobbies" value="travelling"/>
			 Cycling : <form:checkbox path="hobbies" value="cycling"/>
		<br>
		<div>
		<h3>Cummunication</h3>
		<label>Email :</label>
		<form:input path="communicationDTO.email"/>
		<form:errors path="communicationDTO.email" cssClass="error"></form:errors>
		<br>
		 <label>Phone Number :</label>
		<form:input path="communicationDTO.phone"  placeholder="xx-xxxxxxxxxx"/>
		
		</div>
	
		
		
		
		<input type="submit" value="Register">
		</div>
	</form:form>
</body>
</html>
