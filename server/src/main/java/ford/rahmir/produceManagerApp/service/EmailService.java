package ford.rahmir.produceManagerApp.service;

import ford.rahmir.produceManagerApp.model.OrderItem;
import ford.rahmir.produceManagerApp.model.Product;
import ford.rahmir.produceManagerApp.repository.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmailService {

    private JavaMailSender javaMailSender;

    @Autowired
    public EmailService(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    @Autowired
    private ProductOrderRepository productOrderRepository;


    public String productsToOrder(){
        ArrayList<OrderItem> products = (ArrayList<OrderItem>) productOrderRepository.findAll();
        StringBuilder order = new StringBuilder();
        order.append("We would like to order the following for: \n");
        for(OrderItem product: products){
            order.append("\n" + product.getProductDescription() + "      " + product.getQuantity() );
        }
        return order.toString();
    }

    public void SendEmail() throws MailException{

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("xxxxxxx@gmail.com");
        mail.setFrom("xxxxxxxx@gmail.com");
        mail.setSubject("Test Email");
        mail.setText(productsToOrder());

        javaMailSender.send(mail);

    }

}
