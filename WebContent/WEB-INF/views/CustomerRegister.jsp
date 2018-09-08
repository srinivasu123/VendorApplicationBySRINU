<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<%@include file="UserMenu.jsp"%>
	<form action="insertCust" method="post">
		<table   cellspacing="20" align="center">
<tr><td>ID:</td><td><input type="text" name="custId"></td></tr>
<tr><td>Name:</td><td><input type="text" name="custName"></td></tr>
<tr><td>Email:</td><td><input type="text" name="custEmail"></td></tr>
<tr><td>TYPE:</td><td><select name="custType">
<option value="">....select....</option>
<option value="Consumer">Consumer</option>
<option value="Seller">Seller</option>
</select></td></tr>
<tr><td>ADDRESS:</td><td><textarea name="custAddress"></textarea></td></tr>
<!-- <tr><td>PASSWORD:</td><td><input type="password" name="password"></td></tr> -->
<!-- <tr><td>TOKEN:</td><td><input type="password" name="acctoken"></td></tr> -->


</table>
<center><input type="submit" value="submit"></center>
		<h1>${msg}</h1>



	</form>
	<a href="ViewAllCustomers">ViewALLCustomers</a>
</body>
</html>