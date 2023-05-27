<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Utente</title>
</head>
<body>
	<form action="./Login" method="post" >
		<table >
		<tr>
		<td>UserName: </td>
		
		<td><input type="text" name="user"> </td>
		
		</tr>
		<tr>
		<td>Password: </td>
		
		<td><input type="text" name="pss"> </td>
		
		</tr>
		</table>
		<br>
		<input type="submit" value="Login">
	
	</form>
</body>
</html>