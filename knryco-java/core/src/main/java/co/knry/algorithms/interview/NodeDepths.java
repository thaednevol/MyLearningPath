package co.knry.algorithms.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;

public class NodeDepths {

    public static int nodeDepths(BinaryTree root) {
        int sum = 0;
        Stack<BinaryTreeDepth> stack = new Stack<>();
        stack.push(new BinaryTreeDepth(root, 0));

        while (!stack.isEmpty()) {
            BinaryTreeDepth binaryTreeDepth = stack.pop();

            BinaryTree binaryTree = binaryTreeDepth.binaryTree;

            int depth = binaryTreeDepth.depth;

            if (binaryTree == null) {
                continue;
            }

            sum = sum + depth;

            stack.add(new BinaryTreeDepth(binaryTree.right, depth+1));
            stack.add(new BinaryTreeDepth(binaryTree.left, depth+1));


        }

        return sum;

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

    static class BinaryTreeDepth {
        BinaryTree binaryTree;
        int depth;

        public BinaryTreeDepth(BinaryTree binaryTree, int depth) {
            this.binaryTree = binaryTree;
            this.depth = depth;
        }

        
    }

}
