import ford.rahmir.produceManagerApp.logic.ProductLogic;
import ford.rahmir.produceManagerApp.model.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ProductLogicTest {
    Product strawberries;
    ProductLogic productlogic;

    @Before
    public void setUp(){
        strawberries = new Product("Strawberries", 28.50, 8);
        productlogic = new ProductLogic(strawberries);
    }

    @Test
    public void calculateRetailPriceTest(){
        //: Given
        double expected = 6.04;
        //: When
        productlogic.calculateRetailPrice(strawberries);
        double actual = strawberries.getRetailPrice();
        //: Then
        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void calculateUnitCostTest(){
        //: Given
        double expected = 3.56;
        //: When
        productlogic.calculateUnitCost(strawberries);
        double actual = strawberries.getUnitCost();
        //: Then
        Assert.assertEquals(expected,actual,0);
    }


}
