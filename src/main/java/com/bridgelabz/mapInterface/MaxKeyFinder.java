package com.bridgelabz.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class MaxKeyFinder {

    public static void main(String[] args) {
        Map<String, Integer> valueMap = new HashMap<>();
        valueMap.put("A", 10);
        valueMap.put("B", 20);
        valueMap.put("C", 15);
        System.out.println("Key with Max Value: " + MaxKeyFinder.findMaxKey(valueMap));
    }

    // Method to find key for maximum value
    public static String findMaxKey(Map<String, Integer> inputMap) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        return maxKey;
    }
}
/*
Key with Max Value: B
 */