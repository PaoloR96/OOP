package com.AvgServ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AvgServ
 */
@WebServlet("/avg")
public class AvgServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
						
						int somma= Integer.parseInt(request.getParameter("sum"));
						float avg= (float)(somma/2.0);
						PrintWriter out = response.getWriter();
					    out.println("La somma è: " + somma);
					    out.println("La media è: " + avg);
	}

}
