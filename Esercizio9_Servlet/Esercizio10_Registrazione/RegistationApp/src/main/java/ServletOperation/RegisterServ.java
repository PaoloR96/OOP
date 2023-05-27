package ServletOperation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.*;
@WebServlet("/RegisterServ")
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					
					//vado a prendere i parametri inseriti nel form registrazione.html
					String first_name= String.valueOf(request.getParameter("first_name"));
					String last_name= String.valueOf(request.getParameter("last_name"));
					String email= String.valueOf(request.getParameter("email"));
					String password= String.valueOf(request.getParameter("password"));
					
					Controller cr= new Controller();
					boolean IsRegister=cr.CreateAccount(first_name, last_name, email, password);
					if(IsRegister==true) {
						response.sendRedirect("Success.html");
						
						
					}
					
					
					
	}

}
