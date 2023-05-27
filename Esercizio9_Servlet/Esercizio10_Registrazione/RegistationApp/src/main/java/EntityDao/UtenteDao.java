package EntityDao;

import Entity.Utente;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import DbMySqlConn.*;
import QweryUtils.*;
public class UtenteDao {

	public static boolean RegisterUtente(Utente utente) {
		
			try {
				Connection conn=DbManager.GetConnectionDb();
				PreparedStatement st= (PreparedStatement) conn.prepareStatement(QweryUtils.QweryInsert);
				st.setString(1,utente.GetEmail());
				st.setString(2,utente.GetFirstName());
				st.setString(3,utente.GetLastName());
				st.setString(4,utente.GetPswd());
				st.executeUpdate();
				DbManager.CloseConnectionDb();
				
				return true;
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
	}

	 public static boolean LogginUtente(String email, String password) {
		 
		 try {
			 boolean state =false;
				Connection conn=DbManager.GetConnectionDb();
				PreparedStatement st= (PreparedStatement) conn.prepareStatement(QweryUtils.QwerySelect);
				st.setString(1,email);
				st.setString(2,password);
				ResultSet rs=(ResultSet) st.executeQuery();
				if(rs.next()) { state = true;}
				
				rs.close();
				st.close();
				DbManager.CloseConnectionDb();
				return state;
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		 
}
}
