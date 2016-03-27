import java.util.Date;
import java.util.Properties;
import java.util.Set;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


@Component
public class MailService {
	
	private Properties props;
	private Session session;
	private String senderHost;
  private String senderServer;
  private String senderAddress;
  private String senderPassword = "";
  private String recipientAddress;
	private String emailContent;
	
	public MailService(){
		senderHost = "localhost";
	  senderServer = "yular";
	  senderAddress = "yular@gmail.com";
	     
		props = System.getProperties();
	  props.setProperty("mail.smtp.host", senderHost);
	  session = Session.getDefaultInstance(props);
	  
	  emailSubject = "";
	  emailContent = "";
	  recipientAddress = " ... ";
	}
	
	public void sendMailNotification()
	{
        
        try
        {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(senderAddress));
            msg.addRecipient(Message.RecipientType.TO,
                            new InternetAddress(recipientAddress));
            generateMessage();
            msg.setSubject(emailSubject);
            msg.setSentDate(new Date());
            msg.setContent(emailContent, "text/html; charset=utf-8"); // The type of email content can be changed.
            Transport.send(msg);
	    }
        catch (AddressException e)
        {
	    		System.out.println(" Send Fail, Address Exception : " + e);
	    }
        catch (MessagingException e)
        {
	            System.out.println(" Send Fail, Message Exception : " + e);
	    }
	    
	    
	}

  //Set the message content there
	private void generateMessage(){
    	emailSubject = " ... ";
    	emailContent = " ........ ";
  }
  
    
}
