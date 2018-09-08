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
	<form action="UpdateCustomer" method="post">
		ID:<input type="text" name="custId" value="${cust.custId }">
		Name:<input type="text" name="custName" value="${cust.custName }">
		Email:<input type="text" name="custEmail" value="${cust.custEmail }">
		TYPE:<select name="custType">
			<option value="${cust.custType }">Consumer</option>
			<option value="${cust.custType }">Seller</option>
		</select> ADDRESS:
		<textarea name="custAddress">${cust.custAddress }</textarea>
		PASSWORD:<input type="password" name="password"
			value="${cust.password }"> TOKEN:<input type="password"
			name="acctoken" value="${cust.acctoken }"> <input
			type="submit" value="UpdateCustomer">


	</form>
<h1>${msg}</h1>
</body>
</html>