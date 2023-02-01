<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Email Sent</title>
<style>
#result{
color: red;
font-size: 25px;
}
</style>
</head>
<body>
<h1 align="center">Love Calculator</h1>
<h1 align="center">{ FLAMES }</h1><hr>

<hr>

<h2>Hi, ${userInfo.userName}</h2>
<label>Email Successfully sent to : <span id="result"> ${emailDTO.userEmail}</span></label>
</body>
</html>   