<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	<form action="/bmsmvc/UpdateServlet" method="post"
		style="text-align: center; background-color: lime;">
		<div>
			<label style="background-color: orange;"> New Employee No</label> <input
				type="text" name="neno">
		</div>
		<div>
			<label style="background-color: orange;">Employee Name</label> <input
				type="text" name="ename">
		</div>
		<div>
			<label style="background-color: orange;">Employee Salary</label> <input
				type="text" name="esalary">
		</div>
		<h1>OF User With Eno:</h1>
		<div>
			<label style="background-color: orange;">Employee No</label> <input
				type="text" name="eno">
		</div>
		<div>
			<br> <input type="submit" value="Update"
				style="background-color: yellow;">
		</div>
	</form>
	<div style="text-align: center; background-color: yellow;">
		<h3>Click Below To Search User</h3>
		<a href="searchemp.jsp">Click Here</a><br>
	</div>
	<div style="text-align: center; background-color: yellow;">
		<h3>Click Below To Delete User</h3>
		<a href="deleteuser.jsp">Click Here</a><br>
	</div>
	<div style="text-align: center; background-color: yellow;">
		<h3>Click Below To Update User</h3>
		<a href="updateuser.jsp">Click Here</a><br>
	</div>
</body>
</html>