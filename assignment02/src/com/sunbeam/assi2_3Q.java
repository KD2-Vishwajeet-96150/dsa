package com.sunbeam;

public class assi2_3Q {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node front = null, rear = null;

    // -------- ENQUEUE --------
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // -------- DEQUEUE --------
    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted: " + front.data);
        front = front.next;

        if (front == null) rear = null;
    }

    // -------- PEEK --------
    void peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front: " + front.data);
    }

    // -------- DISPLAY --------
    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
