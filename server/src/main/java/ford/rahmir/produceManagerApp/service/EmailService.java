package ford.rahmir.produceManagerApp.service;

import ford.rahmir.produceManagerApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private JavaMailSender javaMailSender;

    @Autowired
    public EmailService(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    public void SendEmail(Product product) throws MailException{
        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setTo("xxxxxxxx@gmail.com");
        mail.setFrom("xxxxxxxxx@gmail.com");
        mail.setSubject("Test Email");
        mail.setText("Test email to see if app works");

        javaMailSender.send(mail);

    }

}
