package EmailUtils;
import java.util.Properties;

import javax.mail.Session;
public class EmailUtily {
	public Session CreateSession() {
		 Properties pros = new Properties();
		 pros.put("mail.transport.protocol","smtps");
	     pros.put("mail.smtps.host","smtp.libero.it");
	     pros.put("mail.smtps.port", 465);
	     pros.put("mail.smtps.auth", "true");
	     pros.put("mail.smtps.quitwait", "false");
	     Session session= Session.getDefaultInstance(pros);
	     session.setDebug(true);
		return session;
		
		
	}

}
