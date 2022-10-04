package co.knry.algorithms.interview;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class NodeDepthsTest {

    @Test
    void nodeDepths() {

        var root = new NodeDepths.BinaryTree(1);
        root.left = new NodeDepths.BinaryTree(2);
        root.left.left = new NodeDepths.BinaryTree(4);
        root.left.left.left = new NodeDepths.BinaryTree(8);
        root.left.left.right = new NodeDepths.BinaryTree(9);
        root.left.right = new NodeDepths.BinaryTree(5);
        root.right = new NodeDepths.BinaryTree(3);
        root.right.left = new NodeDepths.BinaryTree(6);
        root.right.right = new NodeDepths.BinaryTree(7);
        int actual = NodeDepths.nodeDepths(root);
        assertEquals(16, actual);
    }

    @Test
    void testNodeDepths() {
    }
}