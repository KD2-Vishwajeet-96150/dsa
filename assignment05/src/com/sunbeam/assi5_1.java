package com.sunbeam;

public class assi5_1 {

    static int findMode(int[] arr) {
        int maxCount = 0;
        int mode = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 2};
        System.out.println("Mode: " + findMode(arr));
    }
}
