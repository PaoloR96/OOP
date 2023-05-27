package EntityDAO;
import Entity.Utente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import DbManager.*;
import QweryUtils.*;

public class UtenteDAO {
	
		public static boolean CreateAccountUser(Utente utente,String stato)  {
		
			try {
		
				    Connection conn= DbManager.DbConnection();
		            PreparedStatement st= (PreparedStatement) conn.prepareStatement(QweryUtils.QweryInsert);
					st.setString(1,utente.GetIdUser());
				    st.setString(2,utente.GetFirstName());
				    st.setString(3,utente.GetLastName());
				    st.setString(4,utente.GetEmail());
				    st.setString(5,utente.GetPassword());
				    st.setString(6,utente.GetDateBirth());
				    st.setString(7,utente.GetGender());
				    st.setString(8,stato);
				    st.executeUpdate();
				    DbManager.CloseConnection();
				    return true;
			
			} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Problemi di connessione al Db!!");
					return false;
			}
		
		
	    }

		public static String LoginAccountUser(String email, String password) {
			
			try {
				
				Connection conn= DbManager.DbConnection();
				PreparedStatement st= (PreparedStatement) conn.prepareStatement(QweryUtils.QweryLoginUtente);
				st.setString(1,email);
				st.setString(2,password);
				ResultSet rs=(ResultSet) st.executeQuery();
				if(rs.next()) {
					   String IdUser= rs.getString(1);
					   System.out.println(IdUser);
					   rs.close();
					   st.close();
					   DbManager.CloseConnection();
					   return IdUser;
				}
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Problemi di connessione al Db!!");
				
			}
			return null;
			
			
			
		}

		public static ArrayList<Utente> FindAccountUser(String nome, String cognome) {
			
				ArrayList<Utente> listaUtente = new ArrayList<>();
				
				try {
				Connection conn= DbManager.DbConnection();
				PreparedStatement st= (PreparedStatement) conn.prepareStatement(QweryUtils.QweryFindUsers);
				System.out.println(nome+ " "+ cognome);
				st.setString(1,nome);
				st.setString(2,cognome);
				ResultSet rs=(ResultSet) st.executeQuery();
				while(rs.next()) {
					String IdUser= rs.getString(1);
					String Nome= rs.getString(2);
					String Cognome= rs.getString(3);
					
					Utente utente = new Utente(IdUser,Nome,Cognome,"n","n","n","n");
					
					listaUtente.add(utente);
				}
				
				
				
				
				
				rs.close();
				 st.close();
				DbManager.CloseConnection();
				return listaUtente;
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Problemi di connessione al Db!!");
					return null;
				}
		
		
		
		}

		public static boolean SendRequest(String idUserRichiedente, String idUserRicevente,String StatoRichiesta) {
			
			
			try {
				Connection conn= DbManager.DbConnection();
				PreparedStatement st= (PreparedStatement) conn.prepareStatement(QweryUtils.QwerySendRequest);
				st.setString(1,idUserRichiedente);
			    st.setString(2,idUserRicevente);
			    st.setString(3,StatoRichiesta);
			    
			    st.executeUpdate();
				DbManager.CloseConnection();
				return true;
			    
			    
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Problemi di connessione al Db!!");
				e.printStackTrace();
				return false;
			}
			
			
			
			
			
			
			return false;
		}

		public static boolean CkeckRequest(String idUserRichiedente, String idUserRicevente) {
try {
				
				Connection conn= DbManager.DbConnection();
				PreparedStatement st= (PreparedStatement) conn.prepareStatement(QweryUtils.QweryCheckRequest);
				st.setString(1,idUserRichiedente);
				st.setString(2,idUserRicevente);
				ResultSet rs=(ResultSet) st.executeQuery();
				if(rs.next()) {
					   
					   rs.close();
					   st.close();
					   DbManager.CloseConnection();
					   return true;
				}
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Problemi di connessione al Db!!");
				
			}
			return false;
		}

		public static ArrayList<Utente> GenereteListRequestSend(String idUserLoggato) {
			
			ArrayList<Utente> listaRichieste = new ArrayList<>();
			try {
				
				Connection conn= DbManager.DbConnection();
				PreparedStatement st= (PreparedStatement) conn.prepareStatement(QweryUtils.QweryListRequestFriendSend);
				st.setString(1,idUserLoggato);
				ResultSet rs=(ResultSet) st.executeQuery();
				while(rs.next()) {
					String IdUser= rs.getString(1);
					String Nome= rs.getString(2);
					String Cognome= rs.getString(3);
					Utente utente = new Utente(IdUser,Nome,Cognome,"n","n","n","n");
					listaRichieste.add(utente);
				}
				rs.close();
				st.close();
				DbManager.CloseConnection();
				return listaRichieste;
			} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Problemi di connessione al Db!!");
					return null;
			}
		}

		public static ArrayList<Utente> GenereteListRequestReceve(String idUserLoggato) {
			ArrayList<Utente> listaRichieste = new ArrayList<>();
			try {
				
				Connection conn= DbManager.DbConnection();
				PreparedStatement st= (PreparedStatement) conn.prepareStatement(QweryUtils.QweryListRequestFriendReceve1);
				st.setString(1,idUserLoggato);
				ResultSet rs=(ResultSet) st.executeQuery();
				while(rs.next()) {
					String IdUser= rs.getString(1);
					String Nome= rs.getString(2);
					String Cognome= rs.getString(3);
					Utente utente = new Utente(IdUser,Nome,Cognome,"n","n","n","n");
					listaRichieste.add(utente);
				}
				rs.close();
				st.close();
				DbManager.CloseConnection();
				return listaRichieste;
			} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Problemi di connessione al Db!!");
					return null;
			}
		}

		public static boolean AddUserRichiedente(String idUserRicevente, String idUserRichiedente) {
			
			
			try {
				
				Connection conn= DbManager.DbConnection();
		    
					PreparedStatement st= (PreparedStatement) conn.prepareStatement(QweryUtils.QweryAcceptRequest);
					st.setString(2,idUserRicevente);
				    st.setString(1,idUserRichiedente);
				    st.executeUpdate();
				    DbManager.CloseConnection();
				    return true;
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Problemi di connessione al Db!!");
				return false;
			}
			
		}

		public static ArrayList<Utente> GenereteListFriends(String idUserLog) {
			ArrayList<Utente> listaRichieste = new ArrayList<>();
			try {
				
				Connection conn= DbManager.DbConnection();
				PreparedStatement st= (PreparedStatement) conn.prepareStatement(QweryUtils.QweryListFriendsbyRecever);
				st.setString(1,idUserLog);
				ResultSet rs=(ResultSet) st.executeQuery();
				while(rs.next()) {
					String IdUser= rs.getString(1);
					String Nome= rs.getString(2);
					String Cognome= rs.getString(3);
					Utente utente = new Utente(IdUser,Nome,Cognome,"n","n","n","n");
					listaRichieste.add(utente);
				}
				if(listaRichieste.size()==0) {
					
					
					st= (PreparedStatement) conn.prepareStatement(QweryUtils.QweryListFriendsbySender);
					st.setString(1,idUserLog);
					rs=(ResultSet) st.executeQuery();
					while(rs.next()) {
						String IdUser= rs.getString(1);
						String Nome= rs.getString(2);
						String Cognome= rs.getString(3);
						Utente utente = new Utente(IdUser,Nome,Cognome,"n","n","n","n");
						listaRichieste.add(utente);
					}
					
					
					
				}
				
				
				
				
				rs.close();
				st.close();
				DbManager.CloseConnection();
				return listaRichieste;
			} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Problemi di connessione al Db!!");
					return null;
			}
		}

		
		

		
		
			
			
		

}
