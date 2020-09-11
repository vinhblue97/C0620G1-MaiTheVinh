package product_manager.models;

public class Normal extends ProductS {

    public Normal(String productCode, String productName, int cost, int amount, String factory) {
        super(productCode, productName, cost, amount, factory);
        this.productId = numProduct;
        numProduct++;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Id: ").append(getProductId() + "\n").append("Code: ").append(this.productCode + "\n").append("Name: ").append(this.productName + "\n").append("Cost: ").append(this.cost + "\n").append("Amount: ").append(this.amount + "\n").append("Factory: ").append(this.factory + "\n");
        return string.toString();
    }
}


