package ford.rahmir.produceManagerApp.controller;

import ford.rahmir.produceManagerApp.model.Product;
import ford.rahmir.produceManagerApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
/**
 * Created by rahmirford on 6/28/17.
 */
@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Product>> getOrder(){
        ArrayList<Product> productOrder = (ArrayList<Product>) productRepository.findAll();
        return new ResponseEntity<>(productOrder, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<?> addProductToOrder(@RequestBody Product product){
        product = productRepository.save(product);
        return new ResponseEntity<>(product,HttpStatus.CREATED);
    }



}
