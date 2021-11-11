<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/bmsmvc//DeleteUserServlet" method="post"
		style="text-align: center; background-color: lime;">
		<div>
			<label style="background-color: orange;">Employee No</label> <input
				type="text" name="eno">
		</div>
		<div>
			<br> <input type="submit" value="Delete"
				style="background-color: yellow;">
		</div>
	</form>
	<div style="text-align: center;background-color: yellow;">
<h3>Click Below To Add User</h3>
<a href="adduser.jsp">Click Here</a><br>
</div>
<div style="text-align: center;background-color: blue;">
<h3>Click Below To Search User</h3>
<a href="searchemp.jsp">Click Here</a><br>
</div>
<div style="text-align: center;background-color: pink;">
<h3>Click Below To DeleteUser</h3>
<a href="delteuser.jsp">Click Here</a><br>
</div>
<div style="text-align: center; background-color: yellow;">
		<h3>Click Below To Update User</h3>
		<a href="updateuser.jsp">Click Here</a><br>
	</div>
</body>
</html>