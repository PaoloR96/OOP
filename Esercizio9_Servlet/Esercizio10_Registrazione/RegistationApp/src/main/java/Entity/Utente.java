package Entity;

public class Utente {
		private String FirstName;
		private String LastName;
		private String Email;
		private String Pswd;
		//costruttore crezione ogetto utente
		public Utente(String firstName,String lastName,String email, String pswd) {
					this.Email=email;
					this.FirstName=firstName;
					this.LastName=lastName;
					this.Pswd=pswd;
		}
		//creazione set & get
		public String GetFirstName() {
			
			return this.FirstName;
		}
		public String GetLastName() {
			
			return this.LastName;
		}
		public String GetEmail() {
			
			return this.Email;
		}
		public String GetPswd() {
			
			return this.Pswd;
		}
		public void SetFirstName(String firstName) {
			
			this.FirstName=firstName;
		}
		public void SetLastName(String lastName) {
			
			this.LastName=lastName;
		}
		public void SetEmail(String email) {
			
			this.Email=email;
		}
		public void SetPswd(String pswd) {
			
			this.Pswd=pswd;
		}

}
