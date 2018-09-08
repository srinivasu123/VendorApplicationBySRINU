<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="UserMenu.jsp" %>
<h1 style="color:red; text-align:center">Welcome to Vendor Register Page!!!!!</h1>
<form action="updateVendor" method="post">

<table cellspacing="20" align="center">
<tr><td>VENDORID:</td><td><input type="text" name="venid" value="${ven.venid}" readonly="readonly"></td></tr>
<tr><td>VENDORCODE:</td><td><input type="text" name="vencode" value="${ven.vencode}"></td></tr>
<tr><td>VENDORNAME:</td><td><input type="text" name="venName" value="${ven.venName}"></td></tr>
<tr><td>VENDORTYPE:</td>
<td>
	<c:forEach items="${venTypesList}" var="venTypeOb">
		 <c:choose>
		 	<c:when test="${ven.venType eq venTypeOb }">
		 		<input type="radio" name="venType" value="${venTypeOb}" checked="checked">${venTypeOb}
		 	</c:when>
		 	<c:otherwise>
		 	 	<input type="radio" name="venType" value="${venTypeOb}">${venTypeOb}
		 	</c:otherwise>
		 </c:choose>
  	   </c:forEach>
	
	</td>
</tr>
<tr><td>ADDRESS	:</td><td><textarea name="addr">${ven.addr}</textarea></td></tr>
<tr><td>VENDOR IDPROOF:</td><td>
		<select name="idType">
			<option value="">--select--</option>
			<c:forEach items="${venIdTypesList}" var="venIdTypeOb">
				<c:choose>
					<c:when test="${ven.idType eq venIdTypeOb}">
						<option value="${venIdTypeOb}" selected="selected">${venIdTypeOb}</option>
					</c:when>
					<c:otherwise>
						<option value="${venIdTypeOb}">${venIdTypeOb}</option>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</select>
	</td></tr>
<tr><td>VENDOR IDNUMBER:</td><td><input type="text" name="idNum" value="${ven.idNum}"></td></tr>
<tr><td>NOTE:</td><td><textarea name="dsc">${ven.dsc}</textarea></td></tr>
</table>

<input type="submit" value="update">

</form>
</body>
</html>