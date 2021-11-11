<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body bgcolor="red">
	<form action="/bmsmvc//AddServlet" method="post"
		style="text-align: center; background-color: lime;">
		<div>
			<label style="background-color: orange;">Employee No</label> <input
				type="text" name="eno">
		</div>
		<div>
			<label style="background-color: orange;">Employee Name</label> <input
				type="text" name="ename">
		</div>
		<div>
			<label style="background-color: orange;">Employee Salary</label> <input
				type="text" name="esalary">
		</div>
		<div>
			<br> <input type="submit" value="Save"
				style="background-color: yellow;">
		</div>
	</form>
	<div style="text-align: center;background-color: yellow;">
<h3>Click Below To Search User</h3>
<a href="searchemp.jsp">Click Here</a><br>
</div>
<div style="text-align: center;background-color: yellow;">
<h3>Click Below To Delete User</h3>
<a href="deleteuser.jsp">Click Here</a><br>
</div>
<div style="text-align: center;background-color: yellow;">
<h3>Click Below To Update User</h3>
<a href="updateuser.jsp">Click Here</a><br>
</div>
</body>
</html>