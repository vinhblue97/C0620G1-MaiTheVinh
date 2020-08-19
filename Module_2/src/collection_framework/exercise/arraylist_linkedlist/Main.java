package collection_framework.exercise.arraylist_linkedlist;

class Main {
    public static void main(String[] args){
        ProductManager manager = new ProductManager();
        manager.addNewProduct();
        manager.addNewProduct();
        manager.displayProductList();
        manager.deleteProduct();
        manager.displayProductList();
        manager.editInforById();
        manager.findProduct();
        manager.sortProduct();
        manager.displayProductList();
    }
}
