package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Symmetric Difference: " + getSymmetricDifference(set1, set2));
    }

    // Method to get symmetric difference between two sets
    static <T> Set<T> getSymmetricDifference(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>(set1);    // copy elements from set 1
        for (T item: set2){
            if (result.contains(item)){ // If matches, removes from resulting set
                result.remove(item);
            }else {
                result.add(item);
            }
        }
        return result;
    }
}
/*
Set 1: [1, 2, 3]
Set 2: [3, 4, 5]
Symmetric Difference: [1, 2, 4, 5]
 */