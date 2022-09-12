package co.knry.algorithms.interview;

public class NodeDepths {

    public static int nodeDepths(BinaryTree root) {
        return nodeDepths(root, 0);
    }

    private static int nodeDepths(BinaryTree root, int depth) {
        if (root != null) {
            return depth +nodeDepths(root.left, depth+1) + nodeDepths(root.right, depth +1);
        }
        return 0;
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

}
