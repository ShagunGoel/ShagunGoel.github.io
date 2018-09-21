package com.example;

import java.util.Properties;  
import static javafx.beans.binding.Bindings.or;
  
import javax.mail.*;  
import javax.mail.internet.InternetAddress;  
import javax.mail.internet.MimeMessage;  
  
public class Mailer {  
public static void send(String to,String subject,String msg){  
  
final String SMTP_HOST_NAME = "goyalshagun95@yahoo.com";
  final String user="goyalshagun95@yahoo.com";//change accordingly  
  final String pass="diningroom";//change accordingly  
  
//1st step) Get the session object    
Properties props = new Properties();  
props.put("mail.smtp.host", SMTP_HOST_NAME);//change accordingly  
props.put("mail.smtp.auth", "true");
//props.put("mail.smtp.localhost", "client or host name which connect to mail server");
  
Session session = Session.getDefaultInstance(props,  
 new javax.mail.Authenticator() {  
  protected PasswordAuthentication getPasswordAuthentication() {  
   return new PasswordAuthentication(user,pass);  
   }  
});  
//2nd step)compose message  
try {  
 MimeMessage message = new MimeMessage(session);  
 message.setFrom(new InternetAddress(user));  
 message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
 message.setSubject(subject);  
 message.setText(msg);  
   
 //3rd step)send message  
 Transport.send(message);  
  
 System.out.println("Done");  
  
 } catch (MessagingException e) {  
    throw new RuntimeException(e);  
 }  
      
}  
}  