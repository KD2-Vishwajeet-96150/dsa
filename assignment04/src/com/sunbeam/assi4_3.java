package com.sunbeam;

public class assi4_3 {

    static int findNthOccurrence(int[] arr, int target, int n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;

                if (count == n) {
                    return i;  // index of nth occurrence
                }
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};

        int target = 2;
        int n = 3;

        int result = findNthOccurrence(arr, target, n);

        if (result != -1)
            System.out.println("Index of " + n + "th occurrence: " + result);
        else
            System.out.println("Occurrence not found");
    }
}
