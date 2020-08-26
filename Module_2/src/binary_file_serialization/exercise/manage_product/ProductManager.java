package binary_file_serialization.exercise.manage_product;

import java.io.*;
import java.util.LinkedList;

class ProductManager {
    private static int numProduct = 0;
    LinkedList<Product> products = new LinkedList<>();

    private class Product {
        private String id;
        private String name;
        private String manufacturer;
        private double cost;
        private String other;


        public Product(String id, String name, String manufacturer, double cost, String other) {
            this.id = id;
            this.name = name;
            this.manufacturer = manufacturer;
            this.cost = cost;
            this.other = other;
        }

        @Override
        public String toString() {
            return "Id: " + id + "\r\n" +
                    "Name: " + name + "\r\n" +
                    "Manufacturer: " + manufacturer + "\r\n" +
                    "Cost: " + cost + "\r\n";
        }
    }

    public void addProduct(String id, String name, String manufacturer, double cost) {
        Product product = new Product(id, name, manufacturer, cost, "");
        products.add(product);
        numProduct++;
    }

    public void displayProduct() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void writeFile(File destFile) throws IOException {
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(destFile);
            byte[] buffer;
            String line = "\r\n";
            for (Product product:products){
                buffer = (product.toString()+line).getBytes();
                os.write(buffer);
            }
        }catch(IOException ioe){
            System.err.println("Can not write to this file");
        }
        finally {
            os.close();
        }
    }

    public void readFile(File sourceFile){
        FileInputStream is = null;
        try{
            is = new FileInputStream(sourceFile);
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = is.read(buffer))!= -1) {
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
