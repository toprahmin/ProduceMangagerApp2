package ford.rahmir.produceManagerApp.controller;

import ford.rahmir.produceManagerApp.model.Product;
import ford.rahmir.produceManagerApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/products")
@RestController
@CrossOrigin("http://localhost:8100")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Product>> getProducts(){
        ArrayList<Product> productOrder = (ArrayList<Product>) productRepository.findAll();
        return new ResponseEntity<>(productOrder, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<?> addProductToOrder(@RequestBody Product product){
        product = productRepository.save(product);
        return new ResponseEntity<>(product,HttpStatus.CREATED);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteProductFromProducts(@PathVariable("id") long id){
        productRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method= RequestMethod.PUT)
    public ResponseEntity<?> updateProduct(@PathVariable("id") long id, @RequestBody Product product ){
        Product currentProduct = productRepository.findOne(id);
        currentProduct.setUnits(product.getUnits());
        currentProduct.setWholesaleCost(product.getWholesaleCost());
        currentProduct.setProductDescription(product.getProductDescription());
        productRepository.save(currentProduct);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }





}
