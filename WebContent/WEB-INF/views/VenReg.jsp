<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="UserMenu.jsp" %>
<h1 style="color:red; text-align:center">Welcome to Vendor Register Page!!!!!</h1>
<form action="insertVen" method="post">
<table cellspacing="20" align="center">
<tr><td>VENDORID:</td><td><input type="text" name="venid"></td></tr>
<tr><td>VENDORCODE:</td><td><input type="text" name="vencode"></td></tr>
<tr><td>VENDORNAME:</td><td><input type="text" name="venName"></td></tr>
<tr><td>VENDORTYPE:</td><td>	<input type="radio" name="venType" value="CONTRACT">CONTRACT
			<input type="radio" name="venType" value="FULLTIME">FULLTIME
			<input type="radio" name="venType" value="PARTTIME">PARTTIME
</td></tr>
<tr><td>ADDRESS	:</td><td><textarea name="addr"></textarea></td></tr>
<tr><td>VENDOR IDPROOF:</td><td> <select name="idType">
				<option>Select CARD</option>
  				<option>PAN</option>
  				<option>VOTERID</option>
  				<option>AADHARCARD</option>
  				<option>OTHER</option>
				</select>
  </td></tr>
<tr><td>VENDOR IDNUMBER:</td><td><input type="text" name="idNum"></td></tr>
<tr><td>NOTE:</td><td><textarea name="dsc"></textarea></td></tr>
</table>
<pre>
<center><input type="submit" value="Register"></center>
</pre>
<h2 style="color:blue; text-align:center">${msg}</h2>
</form>
<h2 style="color:blue; text-align:center"><a href="viewAllVendors">viewAll</a></h2>
</body>
</html>