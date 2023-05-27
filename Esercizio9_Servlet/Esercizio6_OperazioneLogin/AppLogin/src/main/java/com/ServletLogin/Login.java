package com.ServletLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	PrintWriter pw= response.getWriter();
		response.setContentType("text/html");
		String User= request.getParameter("UserName");
		String Psw= request.getParameter("userPassword");
		pw.println("Login Looding...!");
		if(User.equals("paolo") && Psw.equals("russo"))
			pw.println("Login Success...!");
			else
			pw.println("Login Failed...!");
			pw.close();
	}
}
