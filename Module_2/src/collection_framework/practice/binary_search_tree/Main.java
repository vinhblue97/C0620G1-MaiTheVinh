package collection_framework.practice.binary_search_tree;

class Main {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
            tree.insert(1);
            tree.insert(0);
            tree.insert(2);
            tree.insert(3);
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
