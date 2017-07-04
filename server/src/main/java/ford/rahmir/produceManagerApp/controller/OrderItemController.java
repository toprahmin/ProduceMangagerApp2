package ford.rahmir.produceManagerApp.controller;

import ford.rahmir.produceManagerApp.model.OrderItem;
import ford.rahmir.produceManagerApp.repository.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RequestMapping("/neworder")
@RestController
@CrossOrigin("http://localhost:8100")
public class OrderItemController {


    @Autowired
    private ProductOrderRepository productOrderRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<OrderItem>> getOrder(){
        ArrayList<OrderItem> productOrder = (ArrayList<OrderItem>) productOrderRepository.findAll();
        return new ResponseEntity<>(productOrder, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteProductFromOrder(@PathVariable("id") long id){
        productOrderRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<?> addProductToOrder(@RequestBody OrderItem orderItem){
        orderItem = productOrderRepository.save(orderItem);
        return new ResponseEntity<>(orderItem,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateOrderItem(@PathVariable("id") long id, @RequestBody OrderItem orderItem){
        OrderItem currentOrderItem = productOrderRepository.findOne(id);
        currentOrderItem.setQuantity(orderItem.getQuantity());
        productOrderRepository.save(currentOrderItem);
        return new ResponseEntity<>(currentOrderItem, HttpStatus.OK);
    }

}
