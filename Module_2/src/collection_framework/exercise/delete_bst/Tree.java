package collection_framework.exercise.delete_bst;

interface Tree<E> {
    boolean insert(E e);

    void inorder();

    int getSize();
}
