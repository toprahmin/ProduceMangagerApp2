package ford.rahmir.produceManagerApp.model;

import javax.persistence.*;
import java.time.LocalDate;


/**
 * Created by rahmirford on 6/29/17.
 */
@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ITEM_ID")
    private long id;
    @Column(name = "PROD_DESC")
    private String productDescription;
    @Column(name = "PRODUCT_QUANTITY  ")
    private double quantity;
    private String orderDate = LocalDate.now().toString();


    public OrderItem(){}

    public OrderItem(String productDescription, double quantity){
        this.productDescription = productDescription;
        this.quantity = quantity;
    }


    public void setOrderDate(String orderDate){ this.orderDate = orderDate;}

    public String getOrderDate() {return orderDate;}

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public long getId() {return id;}

    public void setId(long id) {
        this.id = id;
    }
}
