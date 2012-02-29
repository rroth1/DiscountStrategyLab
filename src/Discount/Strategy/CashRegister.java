/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Discount.Strategy;

/**
 *
 * @author rroth1
 */
public class CashRegister {
    private Receipt receipt;
    
    public void startNewSale(String scannedcustomerID) {
        receipt.lookUpCustomer()
    }
    
    public void purchaseNewItem (String scannedProductID, int scannedProductQuantity){
        receipt.addNewLineItem(scannedProductID, scannedProductQuantity);
    }
    
}
