package ServletOperations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ServiceController.Controller;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
					String email=request.getParameter("email");
					String password=request.getParameter("password");
					System.out.println(email+password);
					Controller ServiceController =new Controller();
					String IdUser=ServiceController.LoginUser(email, password);
					if(IdUser!=null) {
						//generete the session
						HttpSession session = request.getSession();
						session.setAttribute("IdUser", IdUser);
						response.sendRedirect("Responsive.jsp?user="+IdUser);
						//creazione del cookie
						Cookie c= new Cookie("user",email);
						c.setMaxAge(30*60);
						response.addCookie(c);
				    }else {
						PrintWriter pw= response.getWriter();
						RequestDispatcher rd = request.getRequestDispatcher("Home.html");
						pw.println("<font color=red>Password or Email is wrong.</font>");
						rd.include(request, response);
						 
					}

}
	
}
