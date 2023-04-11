<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

    <link href="<c:url value="/resources/style.css" />" rel="stylesheet" />

</head>
<body>
<jsp:include page="master.jsp" />
<br><br>
<form name='frm' action='save' method='POST'>
	<input type='text' name='name' value='' placeholder='Enter Name' class="control"/><br><br>
	<input type='text' name='email' value='' placeholder='Enter Email' class="control"/><br><br>
	<input type='text' name='contact' value='' placeholder='Enter Password' class="control"/><br><br>
	<input type='submit' name='s' value='Add New User' class="control"/><br><br>
	${msg}
</form>
</body>
</html>