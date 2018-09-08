<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Location Register Page</title>
<style>
body {
	background-color: powderblue;
}

h1 {
	color: blue;
}
</style>
</head>
<body>
<%@include file="UserMenu.jsp" %>
	<h1 style="color:red; text-align:center">Welcome to Location Register Page!!!!!</h1>
	<form action="insertLoc" method="post">
		<table cellspacing="20" align="center">
		<tr><td>ID:</td><td><input type="text" name="locId"></td></tr>

<tr><td>NAME:</td><td><input type="text" name="LocName" ></td></tr>
<tr><td>CODE:</td><td><input type="text" name="LocCode" ></td></tr>
<tr><td>TYPE:</td><td><input type="radio" name="LocType" value="Urban" >Urban	<input type="radio" name="LocType" value="Rural">Rural</td></tr>
<tr><td>DESCRIPTION:</td><td><textarea name="LocDesc" ></textarea></td></tr>

</table>

<center><input type="submit" value="Create"></center>

		<h2 style="color:red; text-align:center">${msg}</h2>
	</form>
<h2 style="color:blue; text-align:center"><a href="viewAllLocs">viewAll</a></h2>
</body>
</html>