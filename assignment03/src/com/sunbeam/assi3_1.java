package com.sunbeam;

import java.util.*;

public class assi3_1 {

    // ---------------- POSTFIX EVALUATION ----------------
    static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = exp.split(" ");

        for (String token : tokens) {

            // Operand
            if (Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            }
            // Operator
            else {
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }

    // ---------------- PREFIX EVALUATION ----------------
    static int evaluatePrefix(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = exp.split(" ");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            // Operand
            if (Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            }
            // Operator
            else {
                int a = stack.pop();
                int b = stack.pop();

                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Postfix Evaluation");
        System.out.println("2. Prefix Evaluation");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter expression (space separated): ");
        String exp = sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Result = " + evaluatePostfix(exp));
                break;

            case 2:
                System.out.println("Result = " + evaluatePrefix(exp));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
