<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

    <link href="<c:url value="/resources/style.css" />" rel="stylesheet" />

</head>
<body>
<jsp:include page="master.jsp"></jsp:include>
		
	<table>
	<tr>
		<th>NAME</th>
		<th>EMAIL</th>
		<th>PASSWORD</th>
		<th>DELETE</th>
		<th>UPDATE</th>
	</tr>
	<c:forEach var="s" items="${studrecord}">
		<tr>
			<td>${s.getName()}</td>
			<td>${s.getEmail()}</td>
			<td>${s.getContact()}</td>
			<td><a href='del?userid=${s.getId()}'>Delete</a></td>
			<td><a href=''>Update</a></td>
	</c:forEach>
	</table>
</body>
</html>