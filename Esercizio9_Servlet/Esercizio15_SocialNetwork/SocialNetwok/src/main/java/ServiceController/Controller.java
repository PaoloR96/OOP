package ServiceController;

import java.util.ArrayList;

import javax.mail.Part;

import java.time.format.DateTimeFormatter;
import java.io.FileNotFoundException;
import java.time.LocalDateTime; 
import EmailUtils.EmailManager;
import Entity.Utente;
import EntityDAO.*;
import SystemManage.*;
public class Controller {
									
		public boolean RegisterUser(String firstName,String lastName, String gender, String dateB, String email, String passwrd) {
							
							boolean IsSend=EmailManager.SendEmail(email);
							if(IsSend ==true) {
									
									String stato="1";
									String UserId;
									UserId = SystemManage.CreateUserId(firstName,lastName,dateB);
									Utente utente =new Utente(UserId,firstName,lastName,gender,dateB,email,passwrd);
									boolean IsCreate=UtenteDAO.CreateAccountUser(utente,stato);
									return IsCreate;
							}
							return false;
							
		}

		public String LoginUser(String email, String password) {
							
							String IdUser=UtenteDAO.LoginAccountUser(email,password);
							return IdUser;
							
		}

		public ArrayList<Utente> FindUtente(String fullName) {
							
							ArrayList<Utente> listaUtente = new ArrayList<>();
							String[] splitted = fullName.split(" ");
					        String Nome=splitted[0];
				            String Cognome=splitted[1];
				            listaUtente=UtenteDAO.FindAccountUser(Nome,Cognome);
							return listaUtente;
		}

		public boolean SendFriendRequestUser(String IdUserRichiedente, String idUserRicevente) {
							String StatoRichiesta="1";
							boolean IsSend=false;
							boolean IsPresenteRichiesta1=UtenteDAO.CkeckRequest(IdUserRichiedente,idUserRicevente);
							boolean IsPresenteRichiesta2=UtenteDAO.CkeckRequest(idUserRicevente,IdUserRichiedente);
							if(IsPresenteRichiesta1==false && IsPresenteRichiesta2==false)IsSend=UtenteDAO.SendRequest(IdUserRichiedente,idUserRicevente,StatoRichiesta);
							return IsSend;
						
						
		}

		public ArrayList<Utente> ListRequestSend(String idUserLoggato) {
			
							ArrayList<Utente> listaRichieste = new ArrayList<>();
							listaRichieste=UtenteDAO.GenereteListRequestSend(idUserLoggato);
							return listaRichieste;
		
		}

		public ArrayList<Utente> ListRequestRecive(String idUserLoggato) {
			
							ArrayList<Utente> listaRichieste = new ArrayList<>();
							listaRichieste=UtenteDAO.GenereteListRequestReceve(idUserLoggato);
							return listaRichieste;
			
		
		}

		

		public boolean AcceptRequest(String idUserRicevente, String idUserRichiedente) {
			
			boolean IsAddUserRichiedente=UtenteDAO.AddUserRichiedente(idUserRicevente,idUserRichiedente);
			
			return IsAddUserRichiedente;
		}

		public ArrayList<Utente> ListFriends(String idUserLog) {
			
				ArrayList<Utente> listaAmici = new ArrayList<>();
				listaAmici=UtenteDAO.GenereteListFriends(idUserLog);
				return listaAmici;
			
		}

		public boolean CreatePost(String idUserLogg, String contenutoPost) {
			// TODO Auto-generated method stub
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
			 LocalDateTime now = LocalDateTime.now(); 
	         String DataCreazione=(String)(dtf.format(now));
	         boolean IsCreatePost=PostDAO.InsertPostOnlyText(idUserLogg,contenutoPost,1,DataCreazione);
			//System.out.println(DataCreazione+contenutoPost+idUserLogg);
			return IsCreatePost;
				
			
			
		}

		
	

}
