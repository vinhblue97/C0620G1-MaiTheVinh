package product_manager.task;

import product_manager.commons.FileUtil;
import product_manager.models.Export;
import product_manager.models.Import;
import product_manager.models.Normal;
import product_manager.models.ProductS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewProduct {
    List<ProductS> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private String productCode;
    private String productName;
    private int cost;
    private int amount;
    private String factory;
    private int importCost;
    private String importFrom;
    private int importTax;
    private int exportCost;
    private String exportTo;

    public NewProduct(List<ProductS> productList) {
        this.productList = productList;
    }

    public List<ProductS> addNewProduct() {
        do {
            System.out.println("Enter the product's code:");
            this.productCode = scanner.nextLine();
            if (!productCode.equals("")) {
                break;
            }
            System.out.println("Do not skip");
        } while (true);
        do {
            System.out.println("Enter the product's name:");
            this.productName = scanner.nextLine();
            if (!productName.equals("")) {
                break;
            }
            System.out.println("Do not skip");
        } while (true);
        do {
            try {
                System.out.println("Enter the product's cost:");
                this.cost = Integer.parseInt(scanner.nextLine());
                if (cost >= 0) {
                    break;
                } else {
                    System.out.println("Cost must greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter the number");
            }
        } while (true);
        do {
            try {
                System.out.println("Enter the product's amount:");
                this.amount = Integer.parseInt(scanner.nextLine());
                if (amount >= 0) {
                    break;
                } else {
                    System.out.println("Amount must greater than 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter the number");
            }
        } while (true);
        do {
            System.out.println("Enter the product's factory:");
            this.factory = scanner.nextLine();
            if (!factory.equals("")) {
                break;
            }
            System.out.println("Do not skip");
        } while (true);
        if (this.productName.equals("Giay Adidas") || this.productName.equals("Dong ho Rolex") || this.productName.equals("Iphone XS")) {
            do {
                try {
                    System.out.println("Enter import cost :");
                    this.importCost = Integer.parseInt(scanner.nextLine());
                    if (importCost >= 0) {
                        break;
                    } else {
                        System.out.println("Cost must greater than 0");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Enter the number");
                }
            } while (true);
            do {
                System.out.println("Enter import from:");
                this.importFrom = scanner.nextLine();
                if (!importFrom.equals("")) {
                    break;
                }
                System.out.println("Do not skip");
            } while (true);
            do {
                try {
                    System.out.println("Enter importTax:");
                    this.importTax = Integer.parseInt(scanner.nextLine());
                    if (importCost >= 0) {
                        break;
                    } else {
                        System.out.println("Cost must greater than 0");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Enter the number");
                }
            } while (true);
            productList.add(new Import(productCode, productName, cost, amount, factory, importCost, importFrom, importTax));
        } else if (this.productName.equals("Ao dai") || this.productName.equals("Gao")) {
            do {
                try {
                    System.out.println("Enter export cost :");
                    this.exportCost = Integer.parseInt(scanner.nextLine());
                    System.out.println(exportCost);
                    System.out.println(importCost >= 0);
                    if (importCost >= 0) {
                        break;
                    } else {
                        System.out.println("Cost must greater than 0");
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Enter the number");
                }
            } while (true);
            do {
                System.out.println("Enter export to:");
                this.exportTo = scanner.nextLine();
                if (!exportTo.equals("")) {
                    break;
                }
                System.out.println("Do not skip");
            } while (true);
            productList.add(new Export(productCode, productName, cost, amount, factory, exportCost, exportTo));
        } else {
            productList.add(new Normal(productCode, productName, cost, amount, factory));
        }
        FileUtil fileUtil = new FileUtil();
        fileUtil.writeCSV(productList);
        return productList;
    }
}
