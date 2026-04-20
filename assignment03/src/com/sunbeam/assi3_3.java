package com.sunbeam;

import java.util.*;

public class assi3_3 {

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop(); // remove duplicate
            } else {
                stack.push(ch);
            }
        }

        // Build result
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abbaca";
        System.out.println("Result: " + removeDuplicates(input));
    }
}