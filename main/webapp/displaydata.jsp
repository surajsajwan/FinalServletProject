<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Added User Data</title>
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
	<h1>Records Displayed Are As Follows</h1>
	<table>
		<tr>
			<th>Eno:</th>
			<th>Ename:</th>
			<th>ESalary:</th>
		</tr>
		<tr>
			<td>${eno}</td>
			<td>${ename }</td>
			<td>${salary }</td>
		</tr>
	</table>
	<div style="text-align: center; background-color: lime;">
	<h1>	Click Below To Add New User</h1><br> <a href="adduser.jsp">Click
			Here</a>
	</div>
<div style="text-align: center;background-color: blue;">
<h3>Click Below To Search User</h3>
<a href="searchemp.jsp">Click Here</a><br>
</div>
<div style="text-align: center;background-color: pink;">
<h3>Click Below To DeleteUser</h3>
<a href="delteuser.jsp">Click Here</a><br>
</div>
<div style="text-align: center;background-color: yellow;">
<h3>Click Below To Update User</h3>
<a href="updateuser.jsp">Click Here</a><br>
</div>
</body>
</html>