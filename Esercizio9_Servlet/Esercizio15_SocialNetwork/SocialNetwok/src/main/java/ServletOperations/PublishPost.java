package ServletOperations;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import ServiceController.Controller;

/**
 * Servlet implementation class PublishPost
 */
@WebServlet("/PublishPost")
public class PublishPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
						HttpSession session = request.getSession();
						String IdUserLogg=(String) session.getAttribute("IdUser");
						String ContenutoPost=request.getParameter("ContenutoPost");
						Controller ServiceController =new Controller();
						boolean IsCreate=ServiceController.CreatePost(IdUserLogg,ContenutoPost);
						if(IsCreate==true) {
							
							PrintWriter pw= response.getWriter();
							RequestDispatcher rd = request.getRequestDispatcher("InsertPost.jsp");
							pw.println("<font color=blue>The post is add whit success.</font>");
							rd.include(request, response);
						}
		
	}

}
