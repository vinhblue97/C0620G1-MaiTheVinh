package product_manager.models;

public class Import extends ProductS {

    public Import(String productCode, String productName, int cost, int amount, String factory, int importCost, String importFrom, int importTax) {
        super(productCode, productName, cost, amount, factory);
        this.importCost = importCost;
        this.importFrom = importFrom;
        this.importTax = importTax;
        this.productId = numProduct;
        numProduct++;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Id: ").append(getProductId() + "\n").append("Code: ").append(this.productCode + "\n").append("Name: ");
        string.append(this.productName + "\n").append("Cost: ").append(this.cost + "\n").append("Amount: ").append(this.amount + "\n");
        string.append("Factory: ").append(this.factory + "\n");
        string.append("Import Cost: ").append(this.importCost + "\n").append("Import From: ").append(this.importFrom + "\n").append("Import Tax").append(this.importTax + "\n");
        string.append("Export Cost: ").append(this.exportCost + "\n").append("Export To: ").append(this.exportTo + "\n");
        return string.toString();
    }
}
