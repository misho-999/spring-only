package com.example.training.boot;

/**
 * The challenge is to implement the body of the BinarySearchTree "insert" method.
 * The signature of that method should not be changed.
 * However, any additional members may be added to this class as needed.
 */
public class BSTInsertNode {

    /**
     * Standard binary search tree (not balanced), such that the only property is that
     * all left children have lesser values and all right children have greater values.
     */
    private static class BinarySearchTree {
        private Node root;
        /**
         * Inserts a value into the tree, and returns the newly inserted node.
         */
        public Node insert(int value) {
            // TODO: Implement me (do not change this method signature)
            Node node = new Node(value);  //6

            if(root == null){
                root = node;

                return node;
            }

            if(root.getRight() == null) {
                if (root.getLeft() == null) {
                    if (value < root.getLeft().getValue()) {
                        root.setLeft(node);
                    } else if (value > root.getLeft().getValue()) {
                        root.setRight(node);
                    }

                    return node;
                }


            }










            return null;
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(1);
        tree.insert(5);
        tree.insert(23);
        tree.insert(54);
    }

    /**
     * Nodes for use in binary trees.
     * Once constructed, the value is immutable.
     * (The solution should not need to modify this class.)
     */
    private static class Node {
        private final int value;
        private Node left;
        private Node right;

        public Node(final int value) {
            this.value = value;
        }
        public void setLeft(final Node left) {
            this.left = left;
        }
        public void setRight(final Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return this.left;
        }
        public Node getRight() {
            return this.right;
        }
        public int getValue() {
            return this.value;
        }
    }
}