package ford.rahmir.produceManagerApp;
import ford.rahmir.produceManagerApp.model.Product;
import ford.rahmir.produceManagerApp.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by rahmirford on 6/27/17.
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) { SpringApplication.run(Main.class, args);}

//    @Bean
//    CommandLineRunner runner(ProductRepository productRepository){
//        return args -> {
//            productRepository.save(new Product("Strawberries", 31.50, 8));
//        };
//    }
}

