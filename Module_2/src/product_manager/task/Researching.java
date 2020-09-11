package product_manager.task;

import product_manager.models.ProductS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Researching {
    Scanner scanner = new Scanner(System.in);
    List<ProductS> productList = new ArrayList<>();

    public Researching(List<ProductS> productList) {
        this.productList = productList;
    }

    public void research() {
        System.out.println("Enter the key word of product code or name: ");
        String input = scanner.nextLine();
        for (ProductS product : productList) {
            Pattern patternCode = Pattern.compile(product.getProductCode());
            Matcher matcherCode = patternCode.matcher(input);
            Pattern patternName = Pattern.compile("Ao\\sdai");
            Matcher matcherName = patternName.matcher(input);
            if (matcherCode.find()) {
                System.out.println(product.toString());
                System.out.println("****************");
                return;
            } else if (matcherName.find()) {
                System.out.println(product.toString());
                System.out.println("****************");
                return;
            }

        }
        System.out.println("Can not find this product");
    }
}

