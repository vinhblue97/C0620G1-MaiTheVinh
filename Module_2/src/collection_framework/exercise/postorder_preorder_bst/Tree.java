package collection_framework.exercise.postorder_preorder_bst;

interface Tree<E> {

    boolean insert(E e);

    void inorder();

    void preOrder();

    void postOrder();

    int getSize();
}
