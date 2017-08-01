package ford.rahmir.produceManagerApp.model;

import javax.persistence.*;


/**
 * Created by rahmirford on 6/24/17.
 */
@Entity(name = "Product")
@Table(name = "tb_Product")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PRODUCT_ID")
    private long id;
    @Column(name="WHOLESALE_COST")
    private double wholesaleCost;
    @Column(name="UNITS")
    private double units;
    @Column(name = "UNIT_COST")
    private double unitCost;
    @Column(name = "MARGIN")
    private double percentMargin;
    @Column(name = "QUALITY_PRICE_RATIO")
    private double qualityPriceRatio;
    @Column(name = "QUALITY")
    private double productQuality;
    @Column(name = "RETAIL_PRICE")
    private double retailPrice;
    @Column(name = "PROD_DESC")
    private String productDescription;


    public Product(){}


    public Product(String productDescription, double wholesaleCost, double units){
        this.productDescription = productDescription;
        this.wholesaleCost = wholesaleCost;
        this.units = units;
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

    public void setRetailPrice(double retailPrice) { this.retailPrice = retailPrice; }

    public void setProductQualityRatio(double ratio){ this.qualityPriceRatio = ratio;}



}
