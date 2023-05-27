package SystemManage;

public class SystemManage {
	
	public static String CreateUserId(String firstName,String LastName, String DataB) {
					
		  String Punto=".";
	      double doubleRandomNumber = Math.random() * 100;
	      String UserId=firstName+Punto+LastName+DataB.substring(8)+ (int) doubleRandomNumber;
		  return UserId;
	}

}
