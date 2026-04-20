package com.sunbeam;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class assi6_1 {

    // returns level of key, or -1 if not found
    static int findLevel(Node root, int key, int level) {

        if (root == null) return -1;

        if (root.data == key) return level;

        if (key < root.data)
            return findLevel(root.left, key, level + 1);
        else
            return findLevel(root.right, key, level + 1);
    }

    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        int key = 40;

        int level = findLevel(root, key, 1);

        System.out.println("Level of node: " + level);
    }
}
