package SenderEmail;

import java.util.Properties;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import EmailUtils.*;

public class EmailService {
	//paolinoCiccio96@+paolo96R@libero.it
	private final String EmailS="paolo96R@libero.it";
	
	private final String PssSender="paolinoCiccio96@";
	
	
	public boolean EmailSender(String FirstName,String EmailD,String Subject, String msg) throws MessagingException, IOException {
		
		
		// Creo una  sessione smtp
		EmailUtily SessionSmtp = new EmailUtily();
		Session sessionSMTP= SessionSmtp.CreateSession();
		//vado a creare e riempire l'oggetto messaggio
		Message message = new MimeMessage(sessionSMTP);
		message.setSubject(Subject);
		message.setText(msg);
		//definisco il sender ed il reciver
		Address sender = new InternetAddress(EmailS, "Paolo Russo");
        Address receiver = new InternetAddress(EmailD);
        message.setFrom(sender);
        message.setRecipient(Message.RecipientType.TO,receiver);
        //inizializzio session di trasporto e definisco i  parametri di connessione
		Transport tt = sessionSMTP.getTransport();
        tt.connect(EmailS, PssSender);
        //invio messaggio
        tt.sendMessage(message,message.getAllRecipients());
        return true;
    }

}
