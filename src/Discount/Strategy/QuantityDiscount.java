/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Discount.Strategy;

/**
 *
 * @author rroth1
 */
public class QuantityDiscount implements DiscountBehavior {

    private double itemPrice;
    private int itemCount;
    private double itemDiscountTotal;
    private int volumeThreshold = 2;  //hard coded - potentially changed in future
    private double volumeDiscount = 0.20;//hard coded - potentially changed in future

    public QuantityDiscount(int itemCount, double itemPrice) {
        this.itemCount = itemCount;
        this.itemPrice = itemPrice;
    }
    
    
    
    
    @Override
    public double getDiscountAmount(int quantity, double productUnitPrice) {
        if (itemCount >= volumeThreshold) {
            itemDiscountTotal = itemCount * itemPrice * volumeDiscount;
        } else {
            itemDiscountTotal = 0.0;
        }

        return itemDiscountTotal; 
    }
}
