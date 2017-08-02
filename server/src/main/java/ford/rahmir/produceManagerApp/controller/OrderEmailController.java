package ford.rahmir.produceManagerApp.controller;


import ford.rahmir.produceManagerApp.model.Product;
import ford.rahmir.produceManagerApp.service.EmailService;
import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:8100")
public class OrderEmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping("/email-confirmed")
    public void orderConfirmed() {
        Product product = new Product("Strawberries", 31.50, 8);

        try {
            emailService.SendEmail(product);
        } catch (MailException e) {

        }
    }

}