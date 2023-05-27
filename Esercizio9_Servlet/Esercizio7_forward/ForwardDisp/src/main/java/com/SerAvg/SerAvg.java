package com.SerAvg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SerAvg
 */
@WebServlet("/avg")
public class SerAvg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					
					int somma= (int) request.getAttribute("sum");
					float avg=(float)(somma/2.0);
					PrintWriter pw= response.getWriter();
					pw.println("La somma è: " + somma);
					pw.println("La media è: " + avg);
	}

}
