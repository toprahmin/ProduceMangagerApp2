import ford.rahmir.produceManagerApp.model.OrderItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Created by rahmirford on 7/7/17.
 */
public class OrderItemTest {

    OrderItem strawberries;

    @Before
    public void setup(){
        strawberries = new OrderItem("Strawberries", 2);
    }

    @Test
    public void testOrderItemDate(){
        LocalDate expected = null;
//        LocalDate actual = strawberries.getOrderDate();

//        Assert.assertEquals(expected,actual);
    }
}
