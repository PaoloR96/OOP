<%@page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        
        
    </head>
    <body>
        <div class="container">
            <div class="jumbotron text-center">
                <h1>Crea Post</h1>
                
            </div>
            <br>
            <form action="./PublishPost" method="post" >
                <table class="table table-hover">
                    

                    <tr>
                        <td>Contenuto Post</td>
                        <td><textarea name="ContenutoPost" required="" rows="5" cols="100" placeholder="Cosa stai pensando..."></textarea></td>
                    </tr>
                  
                     
                  
                     <tr>
                    
                        
                        <td><input type="submit" id="submit" class="btn btn-primary" value="Pubblica"></td>
                    </tr>
                </table>
            </form>

        </div>
         <br />
    <input type="button" value="Torna indietro"
        onclick="window.location.href='Responsive.jsp'" />
    </body>
</html>