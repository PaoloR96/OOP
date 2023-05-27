<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="Entity.Utente"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Amici</title>
</head>
<body>
 <table border ="1" width="500" align="center">
         <tr bgcolor="00FF7F">
          <th><b>USERNAME</b></th>
          <th><b>NOME</b></th>
          <th><b>COGNOME</b></th>
          <th><b>STATO</b></th>
         </tr>
       
        <%ArrayList<Utente> ListaAmici =(ArrayList<Utente>)request.getAttribute("listaFriends");
        for(Utente u : ListaAmici){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=u.GetIdUser()%></td>
                <td><%=u.GetFirstName()%></td>
                <td><%=u.GetLastName()%></td>
                <td>Aggiunto</td>
            </tr>
            <%}%>
        </table> 
  
    
    
    
    
    
    
    
    
    
    
    
    
    <br />
    <input type="button" value="Torna indietro"
        onclick="window.location.href='Responsive.jsp'" />
  


</body>
</html>