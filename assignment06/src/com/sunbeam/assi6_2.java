package com.sunbeam;

//class Node {
//    int data;
//    Node left, right;
//
//    Node(int data) {
//        this.data = data;
//    }
//}

public class assi6_2 {

    static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    static Node findSuccessor(Node root, Node key) {

        Node successor = null;

        while (root != null) {

            if (key.data < root.data) {
                successor = root;   // potential successor
                root = root.left;
            } 
            else if (key.data > root.data) {
                root = root.right;
            } 
            else {
                // Case 1: right subtree exists
                if (root.right != null) {
                    successor = findMin(root.right);
                }
                break;
            }
        }

        return successor;
    }

    public static void main(String[] args) {

        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.right = new Node(40);

        Node key = root.left.right; // 15

        Node succ = findSuccessor(root, key);

        if (succ != null)
            System.out.println("Successor: " + succ.data);
        else
            System.out.println("No successor");
    }
}
