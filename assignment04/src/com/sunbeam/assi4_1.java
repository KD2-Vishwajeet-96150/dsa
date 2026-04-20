package com.sunbeam;

public class assi4_1 {

    static void printBinary(int n) {
        if (n == 0) {
            return;
        }

        printBinary(n / 2);   // recursive call
        System.out.print(n % 2); // print remainder
    }

    public static void main(String[] args) {
        int num = 10;

        if (num == 0) {
            System.out.print(0);
        } else {
            printBinary(num);
        }
    }
}