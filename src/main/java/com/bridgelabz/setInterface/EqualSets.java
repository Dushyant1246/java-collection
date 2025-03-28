package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EqualSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        System.out.println("Is Set 1 equal to Set 2? " + checkEqual(set1, set2));

    }

    // Method to check if 2 sets are equal regardless of their order
    static <T> boolean checkEqual(Set<T> set1, Set<T> set2) {
        if (set1.size() != set2.size()) return false;
        for (T item : set1) {
            if (!set2.contains(item)) return false;
        }
        return true;
    }
}
/*
Set 1: [1, 2, 3]
Set 2: [3, 2, 1]
Is Set 1 equal to Set 2? true
 */