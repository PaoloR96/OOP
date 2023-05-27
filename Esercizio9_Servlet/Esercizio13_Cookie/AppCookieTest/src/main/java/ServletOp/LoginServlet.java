package ServletOp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
					PrintWriter out = response.getWriter();
					request.getRequestDispatcher("index.html")
		            .include(request,
		                     response);
					String User= request.getParameter("user");
					String Pwd= request.getParameter("pwd");
					if(Pwd.equals("pippo")) {
							out.println("<h1>Welcome " + User + ", you have successfully logged in!</h1>");
							//creazione del cookie
							Cookie c= new Cookie("username",User);
							c.setMaxAge(30*60);
							response.addCookie(c);
					
					
					}else {
						 out.println("Sorry invalid username or password!");
						 response.sendRedirect("login.html");
					}
	
	
	}

}
