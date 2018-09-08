<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<style type="text/css">
table tr th {
	color: red;
	background-color: cyan;
}

th {
	background-color: #4CAF50;
	color: white;
}

tr:nth-child(odd) {
	background-color: #DC143C;
}

tr:nth-child(even) {
	background-color: #006400;
}
</style>
</head>
<body>
	<%@include file="UserMenu.jsp"%>
	<h1 style="color: blue; text-align: center">View ALL Vendors Data
		in HTML Table</h1>

	<center>
		<a href="VenExcelExport">ExportExcel</a> <a href="VendorPdfExport">PDFExport</a>
		<table border="1">

			<tr>
				<th>VENDORID</th>
				<th>VENDORCODE</th>
				<th>VENDORNAME</th>
				<th>VENDORTYPE</th>
				<th>ADDRESS</th>
				<th>VENDOR IDPROOF</th>
				<th>VENDOR IDNUMBER</th>
				<th>NOTE</th>
				<th colspan="2">OPERATION</th>
			</tr>
			<c:forEach items="${vendors}" var="ven">
				<tr>
					<td><c:out value="${ven.venid}" /></td>
					<td><c:out value="${ven.vencode}" /></td>
					<td><c:out value="${ven.venName}" /></td>
					<td><c:out value="${ven.venType}" /></td>
					<td><c:out value="${ven.addr}" /></td>
					<td><c:out value="${ven.idType}" /></td>
					<td><c:out value="${ven.idNum}" /></td>
					<td><c:out value="${ven.dsc}" /></td>

					<td><a href="deleteVen?venId=${ven.venid }"><img
							src="../images/delete.png" width="30" height="30"></a></td>
					<td><a href="editVen?venId=${ven.venid}"><img
							src="../images/edit.png" width="30" height="30" /></a></td>
				</tr>
			</c:forEach>
		</table>
	</center>

</body>
<h2 style="color: red; text-align: center">
	<a href="regVen">home</a>
</h2>
</html>