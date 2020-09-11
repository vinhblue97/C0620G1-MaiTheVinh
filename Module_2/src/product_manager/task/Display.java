package product_manager.task;

import product_manager.models.ProductS;

import java.util.ArrayList;
import java.util.List;

public class Display {
    List<ProductS> productList = new ArrayList<>();

    public Display(List<ProductS> productList) {
        this.productList = productList;
    }

    public void display(){
        for(ProductS product:productList){
            System.out.println(product.toString());
            System.out.println("*************************");
        }

    }

}
