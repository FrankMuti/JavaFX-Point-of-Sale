
package stein.mart.lists;


public class StockList {
    
    private String ID;
    private String product;
    private String unitPrice;
    private String discount;
    private String stockLeft;
    
    public StockList(String ID, String product,String unitPrice, String discount, String stockLeft){
        this.ID = ID;
        this.discount = discount;
        this.product = product;
        this.stockLeft = stockLeft;
        this.unitPrice = unitPrice;
        
        
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the unitPrice
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the discount
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    /**
     * @return the stockList
     */
    public String getStockLeft() {
        return stockLeft;
    }

    /**
     * @param stockList the stockList to set
     */
    public void setStockLeft(String stockList) {
        this.stockLeft = stockList;
    }
    
    
    
}
