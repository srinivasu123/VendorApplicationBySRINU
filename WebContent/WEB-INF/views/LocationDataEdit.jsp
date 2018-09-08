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
<form action="updateLoc" method="post">
<pre>
ID:<input type="text" name="locId" value="${loc.locId}" readonly="readonly">
NAME:<input type="text" name="LocName" value="${loc.locName }">
CODE:<input type="text" name="LocCode" value="${loc.locCode }">
TYPE:
<c:choose>
<c:when test="${'Urban' eq loc.locType }">

<input type="radio" name="LocType" value="Urban" checked="checked" >Urban	
<input type="radio" name="LocType" value="Rural">Rural


</c:when>
<c:otherwise>

<input type="radio" name="LocType" value="Urban"  >Urban	
<input type="radio" name="LocType" value="Rural" checked="checked">Rural

</c:otherwise>


</c:choose>
DESCRIPTION:<textarea name="LocDesc">${loc.locDesc }</textarea>
<input type="submit" value="Update">

</pre>





</form>

</body>
</html>