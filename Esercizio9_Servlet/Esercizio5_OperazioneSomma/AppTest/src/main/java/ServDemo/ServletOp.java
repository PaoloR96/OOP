package ServDemo;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOp
 */
@WebServlet("/ServletOp")
public class ServletOp extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletOp() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			int num1= Integer.parseInt(request.getParameter("num1"));
			int num2= Integer.parseInt(request.getParameter("num2"));
			int somma=num1+num2;
			PrintWriter out= response.getWriter();
			out.print("The result is"+" " + somma);
		
	}

}
