package product_manager.models;

public class Export extends ProductS {
    public Export(String productCode, String productName, int cost, int amount, String factory, int exportCost, String exportTo) {
        super(productCode, productName, cost, amount, factory);
        this.productId = numProduct;
        this.exportCost = exportCost;
        this.exportTo = exportTo;
        numProduct++;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Id: ").append(getProductId() + "\n").append("Code: ").append(this.productCode + "\n").append("Name: ");
        string.append(this.productName + "\n").append("Cost: ").append(this.cost + "\n").append("Amount: ").append(this.amount + "\n");
        string.append("Factory: ").append(this.factory + "\n");
        string.append("Export Cost: ").append(this.exportCost + "\n").append("Export To: ").append(this.exportTo + "\n");
        return string.toString();
    }
}
