/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Discount.Strategy;

/**
 *
 * @author RJR
 */
public class Driver {
    
    public static void main(String[] args) {
        LineItem line = new LineItem("001", 2);
        
        System.out.println(line.getSubTotal());
        
    }
    
}
