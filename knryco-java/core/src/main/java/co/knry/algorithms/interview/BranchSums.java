package co.knry.algorithms.interview;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.}
        var sums = new ArrayList<Integer>();
        branchSums(root, 0, sums);
        return sums;
    }

    public static void branchSums(BinaryTree root, int currentSum, List sums) {
        if (root==null) return ;
        int actualSum = currentSum + root.value;

        if (root.left == null && root.right==null){
            sums.add(actualSum);
            return;
        }
        branchSums(root.left, actualSum, sums);
        branchSums(root.right, actualSum, sums);
    }
}
