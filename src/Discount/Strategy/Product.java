/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Discount.Strategy;

/**
 *
 * @author rroth1
 */
public class Product {

    private String productID;
    private double productUnitPrice;
    private String productDescription;
    private DiscountBehavior discountBehavior;
 
//
    public Product(String productID, String productDescription, double productUnitPrice, DiscountBehavior db) {
        this.productID = productDescription;
        this.productDescription = productDescription;
        this.productUnitPrice = productUnitPrice;
        this.discountBehavior = db;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductID() {
        return productID;
    }

    public double getDiscountAmount(int quantity) {
        return discountBehavior.getDiscountAmount(quantity, productUnitPrice);
    }

    public double getProductUnitPrice() {
        return productUnitPrice;
    }

    public double getProductDiscount(int quantity) {

        return discountBehavior.getDiscountAmount(quantity, productUnitPrice);

    }
//    public static void main(String[] args) {
//        Product prod = new Product("A100", "Men's Black Shoes", 5.99, new QuantityDiscount(3, 5.99));
//    
//    System.out.println(prod.getProductDiscount(3));
//    
//    }
//    
    
}
