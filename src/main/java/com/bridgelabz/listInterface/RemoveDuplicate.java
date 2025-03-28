package com.bridgelabz.listInterface;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));

        System.out.println("Array: " + list);
        System.out.println("Array without duplicates: " + removeDuplicates(list));
    }

    // Method to remove duplicates from array and keep original order
    static <T> List<T> removeDuplicates(List<T> list){
        List<T> result = new ArrayList<>();
        for (T item : list){
            if (!result.contains(item)){
                result.add(item);
            }
        }
        return result;
    }

}
/*
Array: [3, 1, 2, 2, 3, 4]
Array without duplicates: [3, 1, 2, 4]
 */