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
 * Servlet implementation class AddUser
 */
@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String IdUserRichiedente=(String) session.getAttribute("IdUser");
		String IdUserRicevente=request.getParameter("IdUser1");
		System.out.println(IdUserRichiedente + " "+IdUserRicevente);
		Controller ServiceController =new Controller();
		boolean IsSendRequest =ServiceController.SendFriendRequestUser(IdUserRichiedente,IdUserRicevente);
		if(IsSendRequest==true) {
			
			PrintWriter pw= response.getWriter();
			RequestDispatcher rd = request.getRequestDispatcher("Responsive.jsp");
			pw.println("<font color=blue>The request is sent successfully.</font>");
			rd.include(request, response);
		}
	}


}
