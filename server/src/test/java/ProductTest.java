//import ford.rahmir.produceManagerApp.model.Product;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
///**
// * Created by rahmirford on 6/24/17.
// */
//public class ProductTest {
//
//    Product strawberries;
//
//    @Before
//    public void setUp(){
//        strawberries = new Product(28.00, 8, 41);
//
//    }
//
//    @Test
//    public void testCalculateUnitCost(){
//        //: Given
//        double expectedUnitCost = 3.5;
//        //: When
//        double actualUnitCost = strawberries.calculateUnitCost();
//        //: Then
//        Assert.assertEquals("the unit cost should be 3.5", expectedUnitCost,actualUnitCost,0);
//    }
//
//    @Test
//    public void testCalculateRetailPrice(){
//        //: Given
//        double expectedRetailPrice = 5.93;
//        //: When
//        strawberries.calculateUnitCost();
//        double actualRetailCost = strawberries.calculateRetailPrice();
//        //: Then
//        Assert.assertEquals("The expected retail value is 5.93", expectedRetailPrice,actualRetailCost,0);
//    }
//
//    @Test
//    public void testCalculateQualityPriceRatio(){
//        //: Given
//        strawberries.setProductQuality(7.3);
//        strawberries.setUnitCost(3.5);
//        double expectedQualityPriceRatio = 2.09;
//        //: When
//        double actualQualityPriceRatio = strawberries.calculateQualityPriceRatio();
//        //: Then
//        Assert.assertEquals("The expected quality to price ratio should be 2.09", expectedQualityPriceRatio,actualQualityPriceRatio,0);
//    }
//
//}
