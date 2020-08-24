package binary_file_serialization.exercise.manage_product;

import java.io.File;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        ProductManager product = new ProductManager();
        product.addProduct("0wqe","Table","Vinahouse",100000);
        product.addProduct("1dad","Chair","haha",50000);
        product.addProduct("2zxc","Mouse","jerry",800000);
        product.addProduct("3hggghj","CPU","PC",10000000);
        product.displayProduct();
        product.writeFile(new File("E:\\C0620G1-MaiTheVinh\\Module_2\\src\\binary_file_serialization\\exercise\\manage_product\\destFile.txt"));
    }


}
