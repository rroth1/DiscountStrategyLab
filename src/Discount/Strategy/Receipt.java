/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Discount.Strategy;

/**
 *
 * @author rroth1
 */
public class Receipt {

    private Customer customer;
    private LineItem[] lineItems;

   public Receipt (String scannedCustomerID){
               
   }
       private Customer lookUpCustomer() {
        Customer customerLookUp = null;

        for (Customer c : customerList) {
            if (scannedCustomerID.equals(c.getCustomerID())) {
                customerLookUp = c;
                break;
            }
        }
        return customerLookUp;
    }
    
    public void addNewLineItem(String scannedProductID, int scannedQuantity) {
        LineItem lineItem = new LineItem(scannedProductID, scannedQuantity);


        // add lineItem to array
        LineItem[] temp = new LineItem[lineItems.length + 1];
        for (int i = 0; i < lineItems.length; i++) {
            temp[i] = lineItems[i];
        }
        temp[lineItems.length] = lineItem; //add new line item to end of array
        lineItems = temp; //reassign name to temp array effectively deleting temp


    }
}
