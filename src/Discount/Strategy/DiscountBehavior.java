package Discount.Strategy;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rroth1
 */
public interface DiscountBehavior {
    
    public abstract double getDiscountAmount(int quantity, double productUnitPrice);
    
}
