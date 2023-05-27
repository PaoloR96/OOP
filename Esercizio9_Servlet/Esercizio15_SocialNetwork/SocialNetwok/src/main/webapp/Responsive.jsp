<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<head>

	<meta charset="ISO-8859-1">
	<title>Pagina Principale</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
	<script type="text/javascript">
	
			<%String IdUser=(String) session.getAttribute("IdUser");%>
			
			function FindUser() {
				
				location.href=("FindUser.jsp");
			
			}
			
function InsertPost() {
				
				location.href=("InsertPost.jsp");
			
			}
			
function InsertPostImg() {
	
	location.href=("InsertPostImg.jsp");

}
			
	</script>


</head>

<body>

	<h3> Benvenuto <%=IdUser%></script> su Responsive</h3>
	
	<br>
	<table align="center">
		<tr>
            <td>Ricerca Utente:</td>
            <td> <button type="button" class="btn btn-primary"  onclick="FindUser()">Ricerca & Aggiungi</button> </td>
        </tr>
        <tr>
            <td>Elenco Richieste Inviate:</td>
            <td><form action="./FriendRequestSend" method="post"> <button type="submit" class="btn btn-primary">Richieste Amicizia Inviate</button></form></td>
        </tr>
        
        <tr>
        	<td>Elenco Richieste Ricevute:</td>
            <td><form action="./FriendRequestRecive" method="post"> <button type="submit" class="btn btn-primary">Richieste Amicizia Ricevute</button></form></td>
        </tr>
        <tr>
            <td>Elenco Amici:</td>
            <td><form action="./FriendList" method="post"> <button type="submit" class="btn btn-primary">Elenco Amici</button></form></td>
        </tr>
        
        <tr>
            <td>Inserimento Post:</td>
            <td> <button type="button" class="btn btn-primary"  onclick="InsertPost()">Inserimento Post</button> </td>
        </tr>
        
        
        <tr>
        	<td>Logout:</td>
            <td><form action="./Logout" method="post"> <button type="submit" class="btn btn-primary">Logout </button></form></td>
        </tr>
        
        
        
        
        
        
       
        
        
		</table>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
		
</body>
</html>