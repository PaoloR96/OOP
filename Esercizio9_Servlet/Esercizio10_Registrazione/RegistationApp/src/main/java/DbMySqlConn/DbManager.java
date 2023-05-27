package DbMySqlConn;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import DbMySqlConn.DbUtils;

public class DbManager {
				private static Connection conn=null;
	
				public static Connection GetConnectionDb() throws ClassNotFoundException, SQLException {
					//Caricamento Driver MySql 
					Class.forName(DbUtils.NameDriver);
					conn= (Connection) DriverManager.getConnection(DbUtils.UrlConnection, DbUtils.UserName, DbUtils.Pwd);
					return conn;
				}
				public static void CloseConnectionDb() throws SQLException {
					conn.close();
				}
}
