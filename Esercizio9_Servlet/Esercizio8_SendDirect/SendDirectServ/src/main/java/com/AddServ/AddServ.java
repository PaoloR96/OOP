package com.AddServ;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServ
 */
@WebServlet("/add")
public class AddServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
						int num1= Integer.parseInt(request.getParameter("num1"));
						int num2= Integer.parseInt(request.getParameter("num2"));
						int somma=num1+num2;
						 // Redirect the response to the
				        // other servlet - AvgServ.java
						response.sendRedirect("avg?sum="+somma);
	
	
	}

}
