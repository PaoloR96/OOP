import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Main {

	public static void main(String[] args) {
		
		ConnessioneDb db= new ConnessioneDb();
		db.GetConnection();
		
	}

}
