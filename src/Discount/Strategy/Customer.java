/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Discount.Strategy;

/**
 *
 * @author RJR
 */
public class Customer {

    private String customerID;
    private String customerName;

    public Customer(String scannedCustomerID, String customerName) {
        this.customerID = scannedCustomerID;
        this.customerName=customerName;
    }

    //
    //loop to search for customer that was passed to the line item
     public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }
//    private static Customer[] customerList = {new Customer("AA", "John Smith"),
//        new Customer("AB", "Michael Jackson"),
//        new Customer("AC", "Meryl Streep")};
}
