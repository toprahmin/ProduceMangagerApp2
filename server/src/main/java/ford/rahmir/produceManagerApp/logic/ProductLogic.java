package ford.rahmir.produceManagerApp.logic;
import ford.rahmir.produceManagerApp.model.Product;

/**
 * Created by rahmirford on 7/5/17.
 */
public class ProductLogic {

    public ProductLogic(){}
    public ProductLogic(Product product){}

    public void calculateRetailPrice(Product product){
        double retailValue;
        retailValue = ((product.getWholesaleCost()/product.getUnits())/(100-41.18) * 100);
        retailValue = Math.round(retailValue * 100)/ 100.0;
        product.setRetailPrice(retailValue);
    }

    public void calculateUnitCost(Product product){
        double productUnitCost;
        productUnitCost = product.getWholesaleCost()/product.getUnits();
        productUnitCost = Math.round(productUnitCost * 100)/100.0;
        product.setUnitCost(productUnitCost);
    }

    public void calculateQualityPriceRatio(Product product){
        double qualityToPriceRatio;
        qualityToPriceRatio = product.getProductQuality()/product.getUnitCost();
        qualityToPriceRatio = Math.round(qualityToPriceRatio * 100)/100.0;
        product.setProductQualityRatio(qualityToPriceRatio);
    }



}
