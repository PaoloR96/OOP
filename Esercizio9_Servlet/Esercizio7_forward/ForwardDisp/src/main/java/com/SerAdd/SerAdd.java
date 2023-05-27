package com.SerAdd;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SerAdd
 */
@WebServlet("/add")
public class SerAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 			
		 int num1 = Integer.parseInt(req.getParameter("num1"));
	        int num2 = Integer.parseInt(req.getParameter("num2"));
		 			int somma=num1+num2;
		 			req.setAttribute("sum", somma);
		 			RequestDispatcher reqd = req.getRequestDispatcher("avg");
		 			reqd.forward(req, resp);
		 
		 
	 }
}
