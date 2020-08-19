package collection_framework.practice.binary_search_tree;

interface Tree<E> {

    boolean insert(E e);

    void inorder();

    int getSize();
}
