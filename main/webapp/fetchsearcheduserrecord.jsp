<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetch User Data</title>
<style>
table, td, th {
	border: 1px solid #ddd;
	text-align: left;
}

table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	padding: 15px;
}
</style>
</head>
<body bgcolor="red">

	<a:forEach var="arl" items="${arl }">
		<table>
			<tr>
				<th>Eno</th>
				<th>Ename</th>
				<th>Esalary</th>
			</tr>
			<tr>
				<td>${arl.eno }</td>
				<td>${arl.name }</td>
				<td>${arl.salary}</td>
			</tr>
		</table>
	</a:forEach>
	<h1>
		<a:if test="${empty arl}">No Record Found Of Searched User</a:if>
	</h1>
	<br>
	<div style="text-align: center; background-color: yellow;">
		<h2>Click Below To Search New User</h2>
		<br> <a href="searchemp.jsp">Click Here</a><br>
	</div>
	<div style="text-align: center; background-color: lime;">
		<h2>Click Below To Add New User</h2>
		<br> <a href="adduser.jsp">Click Here</a>
	</div>
	<div style="text-align: center; background-color: brown;">
		<h2>Click Below To Delete User</h2>
		<a href="deleteuser.jsp">Click Here</a><br>
	</div>
	<div style="text-align: center; background-color: yellow;">
		<h2>Click Below To Update User</h2>
		<a href="updateuser.jsp">Click Here</a><br>
	</div>
</body>
</html>