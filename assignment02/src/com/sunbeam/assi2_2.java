package com.sunbeam;

import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
}

class Node {
    Employee data;
    Node next;

    Node(Employee data) {
        this.data = data;
        this.next = null;
    }
}

class EmployeeLinkedList {

    Node head = null;

    // ---------------- ADD EMPLOYEE (AT END) ----------------
    void addEmployee(Employee emp) {
        Node newNode = new Node(emp);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // ---------------- DISPLAY ----------------
    void display() {
        if (head == null) {
            System.out.println("No employees found");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(
                temp.data.empId + " | " +
                temp.data.name + " | " +
                temp.data.salary
            );
            temp = temp.next;
        }
    }

    // ---------------- SEARCH BY NAME ----------------
    void searchByName(String name) {
        Node temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.data.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " +
                    temp.data.empId + " | " +
                    temp.data.name + " | " +
                    temp.data.salary);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Employee not found");
        }
    }

    // ---------------- DELETE BY EMP ID ----------------
    void deleteById(int empId) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // delete head
        if (head.data.empId == empId) {
            head = head.next;
            return;
        }

        Node prev = null, curr = head;

        while (curr != null && curr.data.empId != empId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Employee not found");
            return;
        }

        prev.next = curr.next;
    }

    // ---------------- UPDATE SALARY ----------------
    void updateSalary(int empId, double newSalary) {
        Node temp = head;

        while (temp != null) {
            if (temp.data.empId == empId) {
                temp.data.salary = newSalary;
                System.out.println("Salary updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Employee not found");
    }

    // ---------------- SORT BY SALARY (BUBBLE SORT) ----------------
    void sortBySalary() {
        if (head == null || head.next == null) return;

        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.data.salary > j.data.salary) {
                    // swap Employee objects
                    Employee temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }

        System.out.println("Sorted by salary");
    }
}

public class assi2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeLinkedList list = new EmployeeLinkedList();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search by Name");
            System.out.println("4. Delete by ID");
            System.out.println("5. Update Salary");
            System.out.println("6. Sort by Salary");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    list.addEmployee(new Employee(id, name, salary));
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();
                    list.searchByName(searchName);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    list.deleteById(delId);
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    int upId = sc.nextInt();

                    System.out.print("Enter new salary: ");
                    double newSal = sc.nextDouble();

                    list.updateSalary(upId, newSal);
                    break;

                case 6:
                    list.sortBySalary();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
