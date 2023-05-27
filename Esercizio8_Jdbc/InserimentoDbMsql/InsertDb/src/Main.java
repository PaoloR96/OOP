
public class Main {

	public static void main(String[] args) {
		DbManager dbmanager= new DbManager();
		dbmanager.GetConnection();
		dbmanager.InsertData(8, "Roberto", "Pergola");
		dbmanager.CloseConnection();
	}

}
