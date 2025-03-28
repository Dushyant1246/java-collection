package com.bridgelabz.setInterface;

import java.util.HashSet;

public class SubsetChecker {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);


        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        System.out.println("Is Set 1 a subset of Set 2? " + isSubset(set1, set2));
    }

    // Method to check subset
    static boolean isSubset(HashSet<Integer> subset, HashSet<Integer> superset) {
        return superset.containsAll(subset);
    }
}
/*
Set 1: [2, 3]
Set 2: [1, 2, 3, 4]
Is Set 1 a subset of Set 2? true
 */