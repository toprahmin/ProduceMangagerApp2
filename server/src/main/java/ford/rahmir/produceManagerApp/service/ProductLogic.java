package ford.rahmir.produceManagerApp.service;
import ford.rahmir.produceManagerApp.model.Product;

/**
 * Created by rahmirford on 7/5/17.
 */
public class ProductLogic {

    public ProductLogic(){}
    public ProductLogic(Product product){}

    public double round(double prodValue ){
        return Math.round(prodValue * 100)/100.0;
    }

    public void calculateRetailPrice(Product product){
        double retailValue;
        retailValue = round(((product.getWholesaleCost()/product.getUnits())/(100-41.18) * 100));
        product.setRetailPrice(retailValue);
    }

    public void calculateUnitCost(Product product){
        double productUnitCost;
        productUnitCost = round(product.getWholesaleCost()/product.getUnits());
        product.setUnitCost(productUnitCost);
    }

    public void calculateQualityPriceRatio(Product product){
        double qualityToPriceRatio;
        qualityToPriceRatio = round(product.getProductQuality()/product.getUnitCost());
        product.setProductQualityRatio(qualityToPriceRatio);
    }



}
