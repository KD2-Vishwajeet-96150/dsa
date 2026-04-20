package com.sunbeam;

public class assi5_3 {

    static void insertionSortDesc(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            // CHANGE IS HERE: arr[j] < key (instead of >)
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 5, 6};

        insertionSortDesc(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}