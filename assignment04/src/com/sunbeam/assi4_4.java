package com.sunbeam;

public class assi4_4 {

    static int findLastOccurrence(int[] arr, int key) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;  // update every time
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int key = 2;

        int result = findLastOccurrence(arr, key);

        System.out.println("Last occurrence index: " + result);
    }
}