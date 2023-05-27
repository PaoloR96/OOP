<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
			<form action="./Logout" method="get">
			
			<h2>
            Hello
            <%=request.getParameter("user")%>!
        </h2>
			<br> <input type="submit" value="Logout" />
			
			</form>
</body>
</html>