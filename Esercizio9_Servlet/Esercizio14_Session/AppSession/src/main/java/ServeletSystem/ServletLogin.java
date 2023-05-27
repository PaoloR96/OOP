package ServeletSystem;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/Login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					response.setContentType("text/html");
					String User= request.getParameter("user");
					String Psw= request.getParameter("pss");
					if(Psw.equals("pippo")) {
						//vado a generare la sessione
						HttpSession session = request.getSession();
						session.setAttribute("user", User);
						response.sendRedirect("welcome.jsp?user="+User);
						
					}else {
						
						PrintWriter pw= response.getWriter();
						RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
						pw.println("<font color=red>Password is wrong.</font>");
						rd.include(request, response);
					
					}
	}

}