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
<form action="Uploaddoc" method="post" enctype="multipart/form-data">

<pre>
ID:<input type="text" name="fileId">
DOC:<input type="file" name="fileOb">
<input type="submit" value="Upload">

</pre>


</form>


<table border="1">
<tr>
<th>ID</th>
<th>NAME</th>
<th>LINKS</th>
</tr>
<c:forEach items="${docs }" var="obs">
<tr>
<td><c:out value="${obs[0] }"/></td>
<td><c:out value="${obs[1] }"/></td>
<td><a href="downloadDoc?docId=${obs[0] }">DownLoad</a></td>
</tr>




</c:forEach>





</table>



</body>
</html>