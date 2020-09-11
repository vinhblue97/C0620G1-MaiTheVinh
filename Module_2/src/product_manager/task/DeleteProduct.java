package product_manager.task;

import product_manager.commons.FileUtil;
import product_manager.models.Normal;
import product_manager.models.ProductS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteProduct {
    Scanner scanner = new Scanner(System.in);
    List<ProductS> productList = new ArrayList<>();

    public DeleteProduct(List<ProductS> productList) {
        this.productList = productList;
    }

    public List<ProductS> delete() {
        loop:
        do {
            try {
                boolean check = false;
                System.out.println("Enter the product's code");
                String code = scanner.nextLine();
                if (code.equals("")) {
                    return productList;
                }
                for (ProductS product : productList) {
                    if (product.getProductCode().equals(code)) {
                        System.out.println("Are you sure to delete this product?(Yes/No)");
                        String choiseDelete = scanner.nextLine();
                        if (choiseDelete.equals("Yes")) {
                            productList.remove(product);
                            System.out.println("Product was deleted");
                            Normal.numProduct--;
                            break loop;
                        }
                    }
                }
                if (!check) {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.err.println("Can not find this product, please enter code again");
            }
        } while (true);
        FileUtil fileUtil = new FileUtil();
        fileUtil.writeCSV(productList);
        return productList;
    }
}
