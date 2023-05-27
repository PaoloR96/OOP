package ServletOperations;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.Utente;
import ServiceController.Controller;

/**
 * Servlet implementation class FriendRequestRecive
 */
@WebServlet("/FriendRequestRecive")
public class FriendRequestRecive extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				ArrayList<Utente> listaRichieste = new ArrayList<>();
				HttpSession session = request.getSession();
				String IdUserLoggato=(String) session.getAttribute("IdUser");
				Controller cr= new Controller();
				listaRichieste=cr.ListRequestRecive(IdUserLoggato);
				request.setAttribute("dataReq", listaRichieste);
				RequestDispatcher rd = request.getRequestDispatcher("ListRequestFriendRecive.jsp");
				rd.forward(request, response);
					
	}
	

}
