package product_manager.controller;

import product_manager.commons.FileUtil;
import product_manager.models.Normal;
import product_manager.models.ProductS;
import product_manager.task.DeleteProduct;
import product_manager.task.Display;
import product_manager.task.NewProduct;
import product_manager.task.Researching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    List<ProductS> productList = new ArrayList<>();
    FileUtil fileUtil = new FileUtil();

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        loop:
        do {
            Normal.numProduct = 1;
            productList = fileUtil.readFileCSV();
            System.out.println("--------PRODUCT MANAGEMENT PROGRAM---------\n" +
                    "Choose the task with number\n" +
                    "1. Add new product\n" +
                    "2. Delete product\n" +
                    "3. Display product list\n" +
                    "4. Research\n" +
                    "5. Exit\n" +
                    "Choose one of above: ");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    NewProduct newProduct = new NewProduct(productList);
                    productList = newProduct.addNewProduct();
                    for(ProductS e:productList){
                        System.out.println(e);
                    }
                    break;
                case "2":
                    DeleteProduct deleteProduct = new DeleteProduct(productList);
                    productList = deleteProduct.delete();
                    break;
                case "3":
                    Display display = new Display(productList);
                    display.display();
                    break;
                case "4":
                    Researching researching = new Researching(productList);
                    researching.research();
                    break;
                case "5":
                    break loop;
            }
        } while(true);
    }
}
