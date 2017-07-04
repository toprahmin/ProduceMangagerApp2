package ford.rahmir.produceManagerApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by rahmirford on 6/24/17.
 */
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double wholesaleCost;
    private double units;
    private double unitCost;
    private double percentMargin;
    private double qualityPriceRatio;
    private double productQuality;
    private double retailPrice;
    private String productDescription;



    public Product(){}

    public Product(double wholesaleCost, double units){
        this.wholesaleCost = wholesaleCost;
        this.units = units;
    }

    public Product(double wholesaleCost, double units, double percentMargin){
        this.units=units;
        this.wholesaleCost= wholesaleCost;
        this.percentMargin = percentMargin;
    }

    public Product(String productDescription, double wholesaleCost, double units){
        this.productDescription = productDescription;
        this.wholesaleCost = wholesaleCost;
        this.units = units;
        this.unitCost = calculateUnitCost();
        this.retailPrice = calculateRetailPrice();
    };

    public Product(String productDescription, double wholesaleCost, double units, double productQuality){
        this.productDescription = productDescription;
        this.wholesaleCost = wholesaleCost;
        this.units = units;
        this.productQuality = productQuality;
    };

    public long getId() {
        return id;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getWholesaleCost() {
        return wholesaleCost;
    }

    public void setWholesaleCost(double wholesaleCost) {
        this.wholesaleCost = wholesaleCost;
    }

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public double getPercentMargin() {
        return percentMargin;
    }

    public void setPercentMargin(double percentMargin) {
        this.percentMargin = percentMargin;
    }

    public double getQualityPriceRatio() {
        return qualityPriceRatio;
    }

    public void setQualityPriceRatio(double qualityPriceRatio) {
        this.qualityPriceRatio = qualityPriceRatio;
    }

    public double getProductQuality(){
        return productQuality;
    }

    public void setProductQuality(double productQuality){
        this.productQuality = productQuality;
    }

    public double getRetailPrice(){
        return retailPrice;
    }

    public double calculateUnitCost(){
        unitCost = wholesaleCost / units;
        return unitCost;
    }


    public double calculateRetailPrice(){
        retailPrice =  (unitCost/(100 - percentMargin) * 100);
        retailPrice = Math.round(retailPrice * 100)/100.0;
        return retailPrice;
    }

    public double calculateQualityPriceRatio(){

        qualityPriceRatio = productQuality/ unitCost;
        qualityPriceRatio = Math.round(qualityPriceRatio * 100)/100.0;
        return qualityPriceRatio;
    }

}
