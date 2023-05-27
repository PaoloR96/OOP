package ServletOperation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.Controller;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
			
			String email= String.valueOf(request.getParameter("email"));
			String password= String.valueOf(request.getParameter("password"));
			System.out.println(email +password);
			
			Controller cr= new Controller();
			boolean IsLoggin= cr.LogginUtente(email,password);
			System.out.println(IsLoggin);
			if(IsLoggin==true) {
				//session && cookie
				HttpSession session = request.getSession();
				session.setAttribute(email,password);
				//setting session to expiry in 30 mins
				session.setMaxInactiveInterval(30*60);
				Cookie userName = new Cookie("user", email);
				userName.setMaxAge(30*60);
				response.addCookie(userName);
				response.sendRedirect("LoginSucceess.html");
				
				
			}
		
		
	}

}
