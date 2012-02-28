/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Discount.Strategy;

/**
 *
 * @author rroth1
 */
public class ClearanceDiscount implements DiscountBehavior {

//    private int itemCount;
    private double itemDiscountTotal;
    private double clearanceDiscountRate = .50; //initial hard code can be altered in future

//    public ClearanceDiscount(int itemCount, double itemPrice) {
//        this.itemCount = itemCount;
//        this.itemPrice = itemPrice;
//    }
    @Override
    public double getDiscountAmount(int quantity, double productUnitPrice) {

        itemDiscountTotal = quantity * productUnitPrice * clearanceDiscountRate;

        return itemDiscountTotal;
    }
}
