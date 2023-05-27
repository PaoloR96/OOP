package ServletOp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/Profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String Name=null;
		//richiamo l'array dei cookie
		javax.servlet.http.Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            out.println("<h1> You are a new user, kindly login. </h1>");
            request.getRequestDispatcher("login.html").include(request, response);
            // Above statement includes login.html for the
            // user to re-login if username or password is
            // invalid.
        }
        else {
            for (javax.servlet.http.Cookie c : cookies) {
                String tempName = c.getName(); 
               
                if (tempName.equals("username")) {
                    Name = c.getValue(); 
                    out.println("<a href='Logout' style='font-size:25px;'>Logout </a>");
                    out.println("<h1>Welcome to your profile, "+ Name);
                }
            }
        }
    }
}
