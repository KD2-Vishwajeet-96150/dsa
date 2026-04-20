package com.sunbeam;

public class assi2_4 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node tail = null;

    // ---------------- ADD AT POSITION ----------------
    void addAtPosition(int pos, int data) {
        Node newNode = new Node(data);

        // Case 1: Empty list
        if (tail == null) {
            if (pos == 1) {
                tail = newNode;
                tail.next = tail;
            } else {
                System.out.println("Invalid position");
            }
            return;
        }

        // Case 2: Insert at beginning
        if (pos == 1) {
            newNode.next = tail.next;
            tail.next = newNode;
            return;
        }

        Node temp = tail.next; // head
        int count = 1;

        // Traverse to (pos-1)
        while (count < pos - 1 && temp != tail) {
            temp = temp.next;
            count++;
        }

        // If position is beyond range
        if (count < pos - 1) {
            System.out.println("Invalid position");
            return;
        }

        // Insert node
        newNode.next = temp.next;
        temp.next = newNode;

        // If inserted at end → update tail
        if (temp == tail) {
            tail = newNode;
        }
    }

    // ---------------- DELETE AT POSITION ----------------
    void deleteAtPosition(int pos) {

        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        // Case 1: Delete first node
        if (pos == 1) {

            // Only one node
            if (tail.next == tail) {
                tail = null;
                return;
            }

            tail.next = tail.next.next;
            return;
        }

        Node prev = tail.next;
        Node curr = prev.next;
        int count = 2;

        // Traverse to position
        while (count < pos && curr != tail.next) {
            prev = curr;
            curr = curr.next;
            count++;
        }

        // Invalid position
        if (count < pos) {
            System.out.println("Invalid position");
            return;
        }

        // Delete node
        prev.next = curr.next;

        // If deleting tail
        if (curr == tail) {
            tail = prev;
        }
    }

    // ---------------- DISPLAY ----------------
    void display() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail.next;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(circular)");
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        assi2_4 list = new assi2_4();

        list.addAtPosition(1, 10);
        list.addAtPosition(2, 20);
        list.addAtPosition(3, 30);
        list.addAtPosition(2, 15);

        list.display(); // 10 -> 15 -> 20 -> 30

        list.deleteAtPosition(1);
        list.display(); // 15 -> 20 -> 30

        list.deleteAtPosition(3);
        list.display(); // 15 -> 20
    }
}
