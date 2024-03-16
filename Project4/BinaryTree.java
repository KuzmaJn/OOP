public class BinaryTree {

    public static void main(String[] args) {
        String[] tree = {"Július", "Eugen", "Vladislav", "Tamara", "Sabina", "Tomáš", "Matej", "Daniela", "Igor"};
        inOrder(tree, 0);
    }

    static Integer getLeftChild(String[] tree, int index) {
        int leftChildIndex = 2 * index + 1;
        if (leftChildIndex < tree.length) {
            return leftChildIndex;
        }
        return null;
    }

    static Integer getRightChild(String[] tree, int index) {
        int rightChildIndex = 2 * index + 2;
        if (rightChildIndex < tree.length) {
            return rightChildIndex;
        }
        return null;
    }

    static void inOrder(String[] tree, Integer index) {
        if(index != null && index < tree.length) {
            inOrder(tree, getLeftChild(tree, index));
            System.out.print(tree[index] + ", ");
            inOrder(tree, getRightChild(tree, index));
        }
    }
}
