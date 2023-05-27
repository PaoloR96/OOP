package ServletOperations;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Utente;
import ServiceController.Controller;

/**
 * Servlet implementation class FindFriend
 */
@WebServlet("/FindUser")
public class FindUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String FullName=request.getParameter("fullname");
		ArrayList<Utente> listaUtente = new ArrayList<>();
		Controller cr= new Controller();
		listaUtente=cr.FindUtente(FullName);
		if(listaUtente.size()!=0) {
			
			request.setAttribute("dataPer", listaUtente);
			RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
			rd.forward(request, response);
			
	}else {
		response.sendRedirect("NegativeResult.jsp");
		
	}
		
		
		
		
	            
	        }
	}

	


