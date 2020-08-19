package collection_framework.exercise.delete_bst;

class Main {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();

        tree.insert(50);
        for(int index = 0; index < 5;index++){
            tree.insert((int) Math.round(Math.random()*50));
            tree.insert((int) Math.round(Math.random()*50)+50);
        }
        tree.insert(10);
        tree.inorder();
        System.out.println("");
        System.out.println("After delete");
//        tree.deleteNode(9);
        tree.deleteNode(10);
//        tree.deleteNode(4);
    }
}

