<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="Entity.Utente"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ricerca Elemento</title>
</head>
<body>
 <table border ="1" width="500" align="center">
         <tr bgcolor="00FF7F">
          <th><b>Username</b></th>
          <th><b>NOME</b></th>
          <th><b>COGNOME</b></th>
          <th><b>AGGIUNGI</b></th>
         </tr>
       
        <%ArrayList<Utente> ListaUtente =(ArrayList<Utente>)request.getAttribute("dataPer");
        for(Utente u : ListaUtente){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=u.GetIdUser()%></td>
                <td><%=u.GetFirstName()%></td>
                <td><%=u.GetLastName()%></td>
                <td><form action="./AddUser" method="post"> <button type="submit" value =<%=u.GetIdUser()%>  name="IdUser1" class="btn btn-primary">Aggiungi </button></form></td>
            </tr>
            <%}%>
        </table> 
  
    
    
    
    
    
    
    
    
    
    
    
    
    <br />
    <input type="button" value="Torna indietro"
        onclick="window.location.href='Responsive.jsp'" />
  


</body>
</html>