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
        retailValue = ((product.getWholesaleCost()/product.getUnits())/(100-41.18) * 100);
        retailValue = round(retailValue);
        product.setRetailPrice(retailValue);
    }

    public void calculateUnitCost(Product product){
        double productUnitCost;
        productUnitCost = product.getWholesaleCost()/product.getUnits();
        productUnitCost = round(productUnitCost);
        product.setUnitCost(productUnitCost);
    }

    public void calculateQualityPriceRatio(Product product){
        double qualityToPriceRatio;
        qualityToPriceRatio = product.getProductQuality()/product.getUnitCost();
        qualityToPriceRatio = round(qualityToPriceRatio);
        product.setProductQualityRatio(qualityToPriceRatio);
    }



}
