package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {
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
        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersection(set1, set2));
    }

    // Method to find union between two sets
    static <T> Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    // Method to find intersection between two sets
    static <T> Set<T> intersection(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>();
        for (T item: set1) {
            if (set2.contains(item)){
                result.add(item);
            }
        }
        return result;
    }
}
/*
Set 1: [1, 2, 3]
Set 2: [3, 4, 5]
Union: [1, 2, 3, 4, 5]
Intersection: [3]
 */