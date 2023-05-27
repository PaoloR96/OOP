package DbManager;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class DbManager {
	
				private static Connection conn= null;
				
				public static Connection DbConnection() throws ClassNotFoundException, SQLException {
					
					//load Driver
					Class.forName(DbUtils.NameDriver);
					//define the value for the connection to socialdbnetwok Db
					conn= (Connection) DriverManager.getConnection(DbUtils.UrlConnection, DbUtils.UserName, DbUtils.Pwd);
					return conn;
				
				}
				
				public static void CloseConnection() throws SQLException {
					
					//close connection versus Db
					conn.close();
				
				}
				
}
