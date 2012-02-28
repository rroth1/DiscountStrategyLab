/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Discount.Strategy;

/**
 *
 * @author rroth1
 */
public class LineItem {

    private int itemQuantity;
    private double subTotal;
    private Product product;
    private double amountSaved;
    private String productId;
    //
    //'fake' database from which to look up products
    private Product[] productList = {new Product("001", "Pocket square", 5.99, new NoDiscount()),
        new Product("002", "Tie", 19.99, new ClearanceDiscount()),
        new Product("003", "Pants", 29.99, new ClearanceDiscount()),
        new Product("004", "Shirt", 14.99, new QuantityDiscount(itemQuantity, 14.99))};
    //
    //force call to line item to pass Product ID an quantity when created
    //look up productLookUp object using the ID and the 'database'

    public LineItem(String scannedProductID, int scannedQuantity) {
        this.itemQuantity = scannedQuantity;
        this.productId = scannedProductID;
        product = lookUpProduct();
        //
        //calculate subtotal and amountSaved
        subTotal = product.getProductUnitPrice() * itemQuantity - product.getDiscountAmount(itemQuantity);
        amountSaved = product.getDiscountAmount(itemQuantity);

    }
    //
    //loop to search for product that was passed to the line item
    private Product lookUpProduct() {
        Product productLookUp = null;

        for (Product p : productList) {
            if (productId.equals(p.getProductID())) {
                productLookUp = p;
                break;
            }
        }
        return productLookUp;
    }

    public String getProductId() {
        return productId;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public double getSubTotal() {


        return subTotal;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getAmountSaved() {
        return amountSaved;
    }
    

}
