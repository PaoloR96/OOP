package Service;

import Entity.*;
import EntityDao.*;
public class Controller {
				public boolean CreateAccount(String firstName,String lastName,String email, String pswd) {
										
										Utente utente= new Utente(firstName, lastName, email, pswd);
										boolean IsCreate=UtenteDao.RegisterUtente(utente);
										return IsCreate;
				}

				public boolean LogginUtente(String email, String password) {
					
										boolean IsLoggin=UtenteDao.LogginUtente(email,password);
										return IsLoggin;
				}

}
