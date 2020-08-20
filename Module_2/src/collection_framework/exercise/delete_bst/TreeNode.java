package collection_framework.exercise.delete_bst;

public class TreeNode<E> {
    E value;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E value) {
        this.value = value;
        left = null;
        right = null;
    }
}
