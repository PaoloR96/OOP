<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="Entity.Utente"%>
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Richiesta Amicizia Inoltrata</title>
</head>
<body>
 <table border ="1" width="500" align="center">
         <tr bgcolor="00FF7F">
          <th><b>USERNAME</b></th>
          <th><b>NOME</b></th>
          <th><b>COGNOME</b></th>
          <th><b>STATO</b></th>
         </tr>
       
        <%ArrayList<Utente> ListaRichiesteInv =(ArrayList<Utente>)request.getAttribute("dataReq");
        for(Utente u : ListaRichiesteInv){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=u.GetIdUser()%></td>
                <td><%=u.GetFirstName()%></td>
                <td><%=u.GetLastName()%></td>
                <td><form action="./AcceptRequest" method="post"> <button type="submit" class="btn btn-primary" name="IdAdd"  value=<%=u.GetIdUser()%>>Accetta </button></form></form>
                
                
                </td>
            </tr>
            <%}%>
        </table> 
  
    
    
    
    
    
    
    
    
    
    
    
    
    <br />
    <input type="button" value="Torna indietro"
        onclick="window.location.href='Responsive.jsp'" />
  


</body>
</html>