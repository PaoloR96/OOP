package Entity;

public class Utente {
		
			protected String IdUser;
			protected String firstName;
			protected String lastName;
			protected String gender;
			protected String dateB;
			protected String email;
			protected String password;
			
			//parametric constructor, I'm going to define the Utente object
			
			public Utente(String IdUser,String firstName,String lastName, String gender, String dateB, String email, String passwrd){
				      
					  this.IdUser=IdUser;
				      this.firstName=firstName;
				      this.lastName=lastName;
				      this.gender=gender;
				      this.dateB=dateB;
				      this.email=email;
				      this.password=passwrd;
				
			}
			
			

			
				
			



			//-------------------------- define Set & Get-----------------------------------------
			public void SetIdUser(String IdUser) {this.IdUser=IdUser;}
			public void SetFirstName(String FirstName) {this.firstName=FirstName;}
			public void SetLastName(String LastName) {this.lastName=LastName;}
			public void SetGender(String gender) {this.gender=gender;}
			public void SetDateBirth(String dateB) {this.dateB=dateB;}
			public void SetEmail(String email) {this.email=email;}
			public void SetPassword(String password) {this.password=password;}
			
			public String GetIdUser() {return this.IdUser;}
			public String GetFirstName() {return this.firstName;}
			public String GetLastName() {return this.lastName;}
			public String GetGender() {return this.gender;}
			public String GetDateBirth() {return this.dateB;}
			public String GetEmail() {return this.email;}
			public String GetPassword() {return this.password;}
			
	
}
