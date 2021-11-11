<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search User</title>
<style>
.one {
	border: 4px navy;
	background-color: lightblue;
	text-align: center;
}

.two {
	border: 3px yellow;
	background-color: lightblue;
	text-align: center;
}
</style>
</head>
<body bgcolor="red">
	<form action="/bmsmvc/SearchUserServlet" method="post">
		<div class="one">
			<label style="background-color: fuchsia;; text-align: center;">Employee
				No</label> <input type="text" name="eno">
		</div>
		<div class="two">
			<input type="submit" value="Search"
				style="background-color: buttonhighlight;">
		</div>
	</form>
	<br>
	<div style="text-align: center; background-color: lime;">
		Click Below To Add New User<br> <a href="adduser.jsp">Click
			Here</a>
	</div>
	<div style="text-align: center; background-color: yellow;">
		<h3>Click Below To Update User</h3>
		<a href="updateuser.jsp">Click Here</a><br>
	</div>
	
	<div style="text-align: center; background-color: pink;">
		<h3>Click Below To DeleteUser</h3>
		<a href="deleteuser.jsp">Click Here</a><br>
	</div>
</body>
</html>