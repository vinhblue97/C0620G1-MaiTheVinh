package collection_framework.exercise.delete_bst;

class BST<E extends Comparable<E>> extends AbstractTree implements Tree<E> {
    TreeNode<E> root;
    int size = 0;

    public BST() {

    }

    public BST(E[] object) {
        for (E element : object) {
            insert(element);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.value) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.value) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false;
            }
            if (e.compareTo(parent.value) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    public void deleteNode(E e) {

        delete(root, e);
    }

    public void delete(TreeNode<E> node, E e) {
        if (node == null) return;
        if (node.value == e) {
            if (node == null) return;
            delete(node.left,e);
            node = null;
        }
        delete(node.left, e);
        System.out.print(node.value + " ");
        delete(node.right, e);

    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }
}
