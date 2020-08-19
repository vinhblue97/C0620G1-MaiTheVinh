//package collection_framework.exercise.find_bst;
//
//class BST<E extends Comparable<E>> extends AbstractTree<E> {
//    protected TreeNode<E> root;
//    protected int size = 0;
//
//    public BST() {
//
//    }
//
//    public BST(E[] object) {
//        for (E element : object) {
//            insert(element);
//        }
//    }
//
//    @Override
//    public boolean insert(E e) {
//
//        if (root == null)
//            root = createNewNode(e); /*create a new root*/
//        else {
//            /*locate the parent node*/
//            TreeNode<E> parent = null;
//            TreeNode<E> current = root;
//            while (current != null) {
//                if (e.compareTo(current.element) < 0) {
//                    parent = current;
//                    current = current.left;
//                } else if (e.compareTo(current.element) > 0) {
//                    parent = current;
//                    current = current.right;
//                } else
//                    return false; /*Duplicate node not inserted*/
//            }
//            if (e.compareTo(parent.element) < 0)
//                parent.left = createNewNode(e);
//            else
//                parent.right = createNewNode(e);
//        }
//        size++;
//        return true;
//    }
//
//    protected TreeNode<E> createNewNode(E e) {
//        return new TreeNode<>(e);
//    }
//
//    @Override
//    public int getSize() {
//        return size;
//    }
//
//    @Override
//    public void findBST(E element) {
//        inorder(root, element);
//    }
//
//    protected void inorder(TreeNode<E> root, E e) {
//        if (root == null || root.element == e) return;
//        inorder(root.left, e);
//        if (root.element < e) {
//
//        }
//        inorder(root.right, e);
//    }
//}
