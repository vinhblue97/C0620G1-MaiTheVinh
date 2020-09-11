package product_manager.models;

public abstract class ProductS {
    public static int numProduct = 1;
    public int productId;
    public String productCode;
    public String productName;
    public int cost;
    public int amount;
    public String factory;
    public int importCost = 0;
    public String importFrom = "";
    public int importTax = 0;
    public int exportCost = 0;
    public String exportTo = "";

    public String getProductCode() {
        return productCode;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getCost() {
        return cost;
    }

    public int getAmount() {
        return amount;
    }

    public String getFactory() {
        return factory;
    }

    public int getImportCost() {
        return importCost;
    }

    public String getImportFrom() {
        return importFrom;
    }

    public int getImportTax() {
        return importTax;
    }

    public int getExportCost() {
        return exportCost;
    }

    public String getExportTo() {
        return exportTo;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public ProductS(String productCode, String productName, int cost, int amount, String factory) {
        this.productCode = productCode;
        this.productName = productName;
        this.cost = cost;
        this.amount = amount;
        this.factory = factory;
        this.productId = numProduct;
    }

    public abstract String toString();
}
