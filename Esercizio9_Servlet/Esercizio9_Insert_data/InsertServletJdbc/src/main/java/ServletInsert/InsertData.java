package ServletInsert;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.Connection;
import MySqlConnection.DbConnection;
/**
 * Servlet implementation class InsertData
 */
@WebServlet("/ins")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
						
		 // Initialize the database
        try {
			Connection con = DbConnection.ConnectionDbMySql();
			PreparedStatement st = con.prepareStatement("insert into Persona values(?, ?,?)");
			st.setInt(1,Integer.valueOf(request.getParameter("id")));
			st.setString(2,String.valueOf(request.getParameter("nome")));
			st.setString(3,String.valueOf(request.getParameter("cognome")));
			st.executeUpdate();
			st.close();
			con.close();
			PrintWriter out = response.getWriter();
            out.println("<html><body><b>Inserimento avvenuto con successo!!"
                        + "</b></body></html>");
            out.println("<h2><a href='home.html'>HOME</h2>");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
