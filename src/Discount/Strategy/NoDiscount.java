/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Discount.Strategy;

/**
 *
 * @author rroth1
 */
public class NoDiscount implements DiscountBehavior{
    
    @Override
    public double getDiscountAmount(int quantity, double productUnitPrice){
     
        return 0.00;
    }
    
}
