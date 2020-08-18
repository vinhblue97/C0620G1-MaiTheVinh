package collection_framework.exercise.arraylist_linkedlist;

import java.util.*;

class ProductManager {
    Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();
    static int id = 0;

    static class Product {
        private String name;
        private double cost;
        private int productId;

        public Product(String name, double cost) {
            this.productId = id;
            this.name = name;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getProductId() {
            return productId;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Id: " + this.productId + "\n" +
                    "Name: " + this.name + "\n" +
                    "Cost: " + this.cost;
        }
    }

    public void addNewProduct() {
        System.out.println("Enter the new " + id + " product's name");
        String name = scanner.nextLine();
        System.out.println("Enter the new " + id + " product's cost");
        double cost = scanner.nextDouble();
        productList.add(new Product(name, cost));
        id++;
    }

    public void editInforById() {
        System.out.print("Enter the product's id you want to edit information: ");
        int index = scanner.nextInt();
        System.out.println("");
        System.out.print("Enter the " + productList.get(index).getName() + "'s new name: ");
        String newName = scanner.nextLine();
        productList.get(index).setName(newName);
        System.out.println("");
        System.out.print("Enter the " + productList.get(index).getName() + "'s new cost: ");
        double newCost = scanner.nextDouble();
        productList.get(index).setCost(newCost);
    }

    public void deleteProduct() {
        System.out.print("Enter the product's id you want to delete: ");
        int index = scanner.nextInt();
        String checkConfirm = "";
        do {
            System.out.println("Are you sure to delete " + productList.get(index).getName() + " from product list?(Y/N)");
            checkConfirm = scanner.nextLine();
        } while (!checkConfirm.equals("Y") && !checkConfirm.equals("N"));
        if (checkConfirm.equals("Y")) {
            productList.remove(index);
            System.out.println("You deleted this product");
        } else {
            System.out.println("You have not deleted this product yet");
        }
    }

    public void findProduct() {
        System.out.print("Enter the product's id you want to find: ");
        String wantedName = scanner.nextLine();
        for (Product product : productList) {
            if (product.getName() == wantedName) {
                System.out.println("Information about the product you want:");
                System.out.println(product.toString());
            } else {
                System.out.println("Sorry, that product's name isn't alreally exist in list");
            }
        }
    }

    public void sortProduct() {
        productList.sort(Comparator.comparing(p -> p.getCost()));
    }

    public void displayProductList() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }
}
