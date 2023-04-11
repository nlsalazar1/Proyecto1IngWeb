<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Master Page</title>
<link href="<c:url value="/resources/style.css" />" rel="stylesheet" />
    
</head>
<body>

	<ul class="navbar">
		<li><a href='addstudent'>Add New User</a></li>
		<li><a href='view'>View All Users</a></li>
		<li><a href=''>Search User</a></li>
	</ul>

</body>
</html>