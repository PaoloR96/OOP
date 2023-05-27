package QweryUtils;

public class QweryUtils {
	
					public final static String QweryInsert="INSERT INTO Utente (IdUtente,Nome,Cognome,Email,Password,DataNascita,Genere,StatoAccount) VALUES(?,?,?,?,?,?,?,?);";
					public final static String QweryLoginUtente="SELECT * FROM Utente where Email=? and Password=?;";
					public final static String QweryFindUsers="SELECT * FROM Utente where Nome=? and Cognome=?";
					public final static String QwerySendRequest="INSERT INTO RichiestaAmicizia (UtenteRichiedente,UtenteRicevente,StatoRichiesta) VALUES(?,?,?);";
					public final static String QweryCheckRequest="SELECT * FROM RichiestaAmicizia where UtenteRichiedente=? and UtenteRicevente=?";
					public final static String QweryListRequestFriendSend="SELECT DISTINCT Utente.IdUtente,Utente.Nome, Utente.Cognome FROM Utente,richiestaamicizia WHERE richiestaamicizia.UtenteRichiedente=? and (IdUtente IN (SELECT UtenteRicevente FROM richiestaamicizia WHERE StatoRichiesta ='1')) ORDER BY Utente.Nome, Utente.Cognome ASC;";
					//public final static String QweryListRequestFriendReceve="SELECT DISTINCT Utente.IdUtente,Utente.Nome, Utente.Cognome FROM Utente,richiestaamicizia WHERE richiestaamicizia.UtenteRicevente=?  and (IdUtente IN (SELECT UtenteRichiedente FROM richiestaamicizia WHERE StatoRichiesta = '1'))ORDER BY Utente.Nome, Utente.Cognome ASC;";		
					public final static String QweryAcceptRequest="Update  richiestaamicizia set  StatoRichiesta='2' where richiestaamicizia.UtenteRichiedente=? and  richiestaamicizia.UtenteRicevente=?;";		
					public final static String QweryListRequestFriendReceve1="SELECT DISTINCT Utente.IdUtente,Utente.Nome, Utente.Cognome FROM Utente,richiestaamicizia WHERE   richiestaamicizia.StatoRichiesta='1'   and   (IdUtente IN (SELECT UtenteRichiedente FROM richiestaamicizia  WHERE StatoRichiesta = '1'  and richiestaamicizia.UtenteRicevente=?)) ORDER BY Utente.Nome, Utente.Cognome ASC;";

					public final static String QweryListFriendsbyRecever="SELECT DISTINCT Utente.IdUtente,Utente.Nome, Utente.Cognome FROM Utente,richiestaamicizia WHERE richiestaamicizia.UtenteRichiedente=?  and (IdUtente IN (SELECT UtenteRicevente FROM richiestaamicizia WHERE StatoRichiesta ='2')) ORDER BY Utente.Nome, Utente.Cognome ASC;";
					public final static String QweryListFriendsbySender="SELECT DISTINCT Utente.IdUtente,Utente.Nome, Utente.Cognome FROM Utente,richiestaamicizia WHERE   richiestaamicizia.StatoRichiesta='2'   and   (IdUtente IN (SELECT UtenteRichiedente FROM richiestaamicizia WHERE StatoRichiesta = '2'  and richiestaamicizia.UtenteRicevente=? )) ORDER BY Utente.Nome, Utente.Cognome ASC;";
					public final static String InsertPostText="INSERT INTO Post(TipoPost,Contenuto) values (?,?);";
					public final static String CountNumberPost="SELECT MAX(Id_Post)  FROM Post;";
					public final static String QweryPublicPostText="INSERT INTO pubblica(Id_Post,IdUtente,DataCreazione) values (?,?,?);";
					public final static String InsertPostPhoto="INSERT INTO Post(TipoPost,Contenuto,photo) values (?,?,?);";

					public final static String QweryFindUser1="select utente.IdUtente,utente.Nome,utente.Cognome, richiestaamicizia.StatoRichiesta from utente inner join richiestaamicizia on utente.IdUtente= richiestaamicizia.UtenteRicevente where Utente.Nome=? and utente.Cognome=? and richiestaamicizia.StatoRichiesta='1' ;";

}			