package MySqlConnection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DbConnection {
	
	public static Connection ConnectionDbMySql() throws ClassNotFoundException, SQLException {
		 String  UserName="root";
		 String  UserPwd="paolo";
		 String UrlConnection="jdbc:mysql://localhost:3306/DBSERVLET?characterEncoding=latin1";
		 String NameDriver= "com.mysql.jdbc.Driver";
		 //LOAD DRIVER
		 Class.forName(NameDriver);
		 Connection conn= (Connection) DriverManager.getConnection(UrlConnection, UserName,UserPwd);
		return conn;
	}

}
