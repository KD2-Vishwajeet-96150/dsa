package com.sunbeam;

import java.util.*;

public class assi5_2 {

    public static void main(String[] args) {
        String line = "Java is great and Java is powerful";

        // Normalize text
        line = line.toLowerCase();

        // Split words (handles spaces & punctuation)
        String[] words = line.split("\\W+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        // Display result
        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }
    }
}
