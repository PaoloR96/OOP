package EntityDAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

import javax.mail.MessagingException;
import javax.mail.Part;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import DbManager.DbManager;
import QweryUtils.QweryUtils;

public class PostDAO {
	public static boolean InsertPostOnlyText(String idUserLogg, String contenutoPost, int tipo, String dataCreazione) {
		
		try {
			    int IdPost=0;
			    Connection conn= DbManager.DbConnection();
	            PreparedStatement st= (PreparedStatement) conn.prepareStatement(QweryUtils.InsertPostText);
				st.setInt(1,tipo);
			    st.setString(2,contenutoPost);
			    st.executeUpdate();
			    st= (PreparedStatement) conn.prepareStatement(QweryUtils.CountNumberPost);
			    ResultSet rs=(ResultSet) st.executeQuery();
			    if(rs.next()) {
					 IdPost= rs.getInt(1);
				}
			    st= (PreparedStatement) conn.prepareStatement(QweryUtils.QweryPublicPostText);
			    st.setInt(1,IdPost);
			    st.setString(2,idUserLogg);
			    st.setString(3,dataCreazione);
			    st.executeUpdate();
			    rs.close();
				st.close();
				DbManager.CloseConnection();
				
				
				
			    return true;
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Problemi di connessione al Db!!");
			return false;
		}
		
		
		
		
		
	}

	
}
