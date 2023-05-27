package ServletSystemEmail;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import SenderEmail.*;

/**
 * Servlet implementation class ServletSendEmail
 */
@WebServlet("/SendEmail")
public class ServletSendEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
			String Name=request.getParameter("name");
			String EmailD=request.getParameter("email");
			String Subject=request.getParameter("subject");
			String Message=request.getParameter("message");
			EmailService ServiceSender= new EmailService();
			try {
				boolean IsSend=ServiceSender.EmailSender(Name,EmailD,Subject,Message);
				if(IsSend) {
					response.sendRedirect("success.jsp?name="+Name);
				}
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
