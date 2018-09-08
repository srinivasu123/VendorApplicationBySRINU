<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer</title>

</head>
<body>
	<%@include file="UserMenu.jsp"%>
	<h1 style="color: blue; text-align: center">View ALL CustomersData in HTML Table</h1>
	<h2 style="color: red; text-align: center"><a href="CustomerExcelExport">ExportExcel</a></h2>
	<h2 style="color: red; text-align: center"><a href="CustomerpdfExport">pdfExport</a></h2>
	<center>
	<table border="1">
		<tr>
			<th>CID</th>
			<th>CNAME</th>
			<th>EMAIL</th>
			<th>TYPE</th>
			<th>ADDRESS</th>
			<th>PASSWORD</th>
			<th>TOKEN</th>
			<th colspan="2">OPERATION</th>
		</tr>
		<c:forEach items="${customers}" var="lists">
			<tr>
				<td><c:out value="${lists.custId }" /></td>
				<td><c:out value="${lists.custName }" /></td>
				<td><c:out value="${lists.custEmail }" /></td>
				<td><c:out value="${lists.custType }" /></td>
				<td><c:out value="${lists.custAddress }" /></td>
				<td><c:out value="${lists.password }" /></td>
				<td><c:out value="${lists.acctoken }" /></td>
				<td><a href="deleteCustomer?custId=${lists.custId }"><img
						src="../images/delete.png" width="30" height="30"></a></td>
				<td><a href="editCustomer?custId=${lists.custId }"><img
						src="../images/edit.png" width="30" height="30" /></a></td>

			</tr>




		</c:forEach>



	</table>
</center>
</body>
</html>