package com.curso.furukawa.serviciorest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

@Service
public class EmailService {


    public void sendmail(String mailTo) throws AddressException, MessagingException, IOException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.sendgrid.net");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("rcportocarrero", "xdel2015123");
            }
        });
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("newclient@furukawa.com", false));

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailTo));
        msg.setSubject("Creación de cliente - Furukawa");
        msg.setContent("Cliente nuevo:", "text/html");
        msg.setSentDate(new Date());

        Transport.send(msg);
    }
}
