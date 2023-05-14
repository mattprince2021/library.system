package library.system;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StockItem {
    private int stockID;
    private String stockBarcode;
    private int stockQuantity;

    @Id
    public int getStockID() {
        return stockID;
    }

    public void setStockID(int newStockID) {
        stockID = newStockID;
    }

    public String getStockBarcode() {
        return stockBarcode;
    }

    public void setStockBarcode(String newStockBarcode) {
        stockBarcode = newStockBarcode;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int newStockQuantity) {
        stockQuantity = newStockQuantity;
    }
}
