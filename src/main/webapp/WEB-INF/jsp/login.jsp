<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to OPD billing management System</title>
</head>
<body>
<form action="login" method="post" modelAttribute="LoginRequest">
			<table style="with: 50%">
				<tr>
					<td>UserName</td>
					<td><input type="text" name="Username",placeholder="Username" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="Password" ,placeholder="Password"/></td>
				</tr>
				</table>
			<input type="submit" value="signin" />
			<a href="/registration">Signup</a>
			</form>

</body>
</html>