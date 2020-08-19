package collection_framework.exercise.postorder_preorder_bst;

class Main {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
            tree.insert(10);
            tree.insert(8);
            tree.insert(9);
            tree.insert(6);
            tree.insert(3);
            tree.insert(7);
            tree.insert(0);
            tree.insert(4);
            tree.insert(12);
            tree.insert(11);
            tree.insert(15);
            tree.insert(13);
            tree.insert(16);
        System.out.println("Preorder (sorted): ");
        tree.postOrder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
