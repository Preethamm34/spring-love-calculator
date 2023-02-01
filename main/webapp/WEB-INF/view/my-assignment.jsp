<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<!-- 
<h1 align="center">Love Calculater</h1><hr>
 -->
	<form action="assignment" method="get">
		<div>

			<label for="yn">Name :</label> <input type="text" id="yn"
				name="name" /> <br> 
				<label for="age">Age :</label>
			<input type="text" id="age" name="age" /><br> 
			 <label for="dob">Date
				Of Birth :</label> <input type="date" id="dob" name="dob" /><br> 
				 <label for="gender">Gender :</label> 
				 <input type="radio" id="gender"
				name="gender" value="male">   <label for="male">Male</label>
			  <input type="radio" id="gender" name="gender " value="female">
			  <label for="female">Female</label><br> 
			<label>Email Id
				:</label> <input type="email" id="email" name="email" /> <br> 
				<label>Phone
				Number :</label> <input type="text" id="phonenumber" name="phonenumber" /><br> 
			<label>Address :</label> <input type="text" id="address"
				name="address" /><br>  <label for="state">State :</label> <select
				id="state" name="state">
				<option value="Maharastra">Maharastra</option>
				<option value="Tamilnadu">Tamilnadu</option>
				<option value="Karnataka">Karnataka</option>
				<option value="Kerla">Kerla</option>
			</select> <br> 
			<label for="district">District :</label> <select id="district"
				name="district">
				<option value="Bangalore">Bangalore</option>
				<option value="Mysore">Mysore</option>
				<option value="Hassan">Hassan</option>
				<option value="Mangalore">"Mangalore"</option>
			</select> <br> 
			<input type="submit" value="Submit">

		</div>
	</form><hr>
	
	<h1> View Your Details</h1>
	
<p>Name : ${name} </p>
<p>Age : ${age}</p> 
<p>Date Of Birth : ${dob} </p>
<p>Gender : ${gender}   </p> 
<p>Email Id : ${email}</p>   
<p>Phone Number : ${phonenumber}</p> 
<p>Address : ${address} </p>
<p>State : ${state}  </p>
<p>District : ${district} </p>
	
<br>



</body>
</html>