package DbConnection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
		
		static final String URL_DB="jdbc:mysql://localhost:3306/MYLOGIN?characterEncoding=latin1";
		static final String USER_DB="root";
		static final String PSW_DB="paolo";
		private static Connection con = null;
	    static {
		
				try {
						//load driver
						Class.forName("com.mysql.jdbc.Driver");
						con = DriverManager.getConnection(URL_DB, USER_DB, PSW_DB);
						System.out.print("Connessione Stabilita con il db!");
		
				} catch (ClassNotFoundException e) {
			
						System.out.print("Problemi nel caricamento del driver!!");
						e.printStackTrace();
		
				} catch (SQLException e) {
			
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
		
		}
	 
		public static Connection getConnection(){
			
			//CreateConnection();   
			return con;
	    }
}
	

	
