package com.sunbeam;

public class assi2_3 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top = null; // head

    // -------- PUSH --------
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // -------- POP --------
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    // -------- PEEK --------
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top: " + top.data);
    }

    // -------- DISPLAY --------
    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}