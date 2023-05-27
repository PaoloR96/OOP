import java.sql.*;

public class ConnessioneDb {
	static final String DB_URL ="jdbc:mysql://localhost:3306/PROVA?characterEncoding=latin1&useConfigs=maxPerformance";
	static final String USER = "root";
	static final String PASS = "paolo";
	public void GetConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("Driver msql caricato!!");
			System.out.println();
			try {
				Connection con=DriverManager.getConnection(DB_URL,USER,PASS);
				System.out.print("Connessione al Db effettuata con successo!!");
				System.out.println();
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from persona");  
				while(rs.next())  
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
					con.close();  
			} catch (SQLException e) {
				System.out.print("Problemi di connessione al db!");
				System.out.println();
			} 
		} catch (ClassNotFoundException e) {
				System.out.print("Problemi nel caricamento del driver!!");
				System.out.println();
		}  
}
}