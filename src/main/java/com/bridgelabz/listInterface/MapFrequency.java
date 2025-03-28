package com.bridgelabz.listInterface;

import java.util.HashMap;
import java.util.Map;

public class MapFrequency {

    // Method to count frequency of each element of a string array and give result in a Map<K,V>
    static Map<String, Integer> frequencyOfElements(String[] items){
        Map<String, Integer> result = new HashMap<>();
        for (String item: items){
            if (!result.containsKey(item)){
                result.put(item, 1);    // Insert 1 frequency for a new element
            }else {
                result.replace(item, result.get(item) + 1); // Replace +1 value for existing element
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] items = {"apple", "banana", "apple", "mango", "banana", "watermelon", "banana"};
        System.out.println(frequencyOfElements(items));
    }
}
/*
{banana=3, apple=2, watermelon=1, mango=1}
 */