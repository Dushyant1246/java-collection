package com.bridgelabz.setInterface;

import java.util.*;

public class SetSortedList {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(50);
        set.add(3);
        set.add(9);
        set.add(1);
        set.add(20);
        set.add(15);
        List<Integer> list = toList(set);
        System.out.println(list);
    }

    // Method to convert set to ascending list
    static List<Integer> toList(Set<Integer> set){
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
/*
[1, 3, 9, 15, 20, 50]
 */