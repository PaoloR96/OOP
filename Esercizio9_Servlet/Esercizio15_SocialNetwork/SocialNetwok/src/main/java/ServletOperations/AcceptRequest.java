package ServletOperations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ServiceController.Controller;

/**
 * Servlet implementation class AcceptRequest
 */
@WebServlet("/AcceptRequest")
public class AcceptRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
						
						HttpSession session = request.getSession();
						String IdUserRicevente=(String) session.getAttribute("IdUser");
						String IdUserRichiedente=request.getParameter("IdAdd");
						System.out.println(IdUserRicevente +" "+ IdUserRichiedente);
						Controller cr= new Controller();
						boolean IsAdd=cr.AcceptRequest(IdUserRicevente,IdUserRichiedente);
						if(IsAdd==true) {
							PrintWriter pw= response.getWriter();
							
							pw.println("<font color=green>User"+IdUserRicevente+ "and User"+IdUserRichiedente + "hanno stretto amicizia.</font>");
							RequestDispatcher rd = request.getRequestDispatcher("Responsive.jsp");
							rd.include(request, response);
						}
	}

}
