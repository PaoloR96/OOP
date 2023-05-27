package ServletOperations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ServiceController.*;
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					 PrintWriter pw= response.getWriter();
					//define value
					 String firstName=request.getParameter("first_name");
					 String lastName=request.getParameter("last_name");
					 String gender=request.getParameter("gender");
					 String email=request.getParameter("email");
					 String password=request.getParameter("password");
					 String dateB=(request.getParameter("day"))+"/"+(request.getParameter("month"))+"/"+(request.getParameter("year"));
					 System.out.println(dateB);
					 Controller ServiceController =new Controller();
					 boolean ISerCreate=ServiceController.RegisterUser(firstName, lastName, gender, dateB, email, password);
					 if(ISerCreate==true) {
						 RequestDispatcher rd = request.getRequestDispatcher("Login.html");
						 pw.println("<font color=green>The account was created successfully.Now , you con login.</font>");
						 rd.include(request, response);
						 
					}else {
						 
						
						RequestDispatcher rd = request.getRequestDispatcher("Home.html");
						pw.println("<font color=red>Password or Email is wrong.</font>");
						rd.include(request, response);
						 
					}
					 
		
		
		
		
		
		
		
	}

}
