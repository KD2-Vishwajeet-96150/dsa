package com.sunbeam;

public class assi2_1 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node tail = null;  // Only pointer we maintain

    // ---------------- INSERT AT BEGINNING ----------------
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }

    // ---------------- INSERT AT END ----------------
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;  // move tail
        }
    }

    // ---------------- DELETE FROM BEGINNING ----------------
    void deleteFromBeginning() {
        if (tail == null) return;

        if (tail.next == tail) { // single node
            tail = null;
        } else {
            tail.next = tail.next.next;
        }
    }

    // ---------------- DELETE FROM END ----------------
    void deleteFromEnd() {
        if (tail == null) return;

        if (tail.next == tail) {
            tail = null;
            return;
        }

        Node temp = tail.next;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = tail.next;
        tail = temp;
    }

    // ---------------- DISPLAY ----------------
    void display() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = tail.next; // head

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(circular)");
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        assi2_1 list = new assi2_1();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);

        list.display();

        list.deleteFromBeginning();
        list.display();

        list.deleteFromEnd();
        list.display();
    }
}
