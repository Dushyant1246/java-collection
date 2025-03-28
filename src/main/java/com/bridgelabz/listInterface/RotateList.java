package com.bridgelabz.listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Before rotate: " + list);
        rotateList(list, 3);
        System.out.println("After rotation by 2: " + list);
    }

    // Method to rotate list
    static <T> void rotateList(List<T> list, int rotateBy){
        int length = list.size();
        if (length <= 1) return;
        reverseList(list, 0, rotateBy - 1); // reverse till rotateBy
        reverseList(list, rotateBy, length - 1);    // reverse after rotateBy
        reverseList(list, 0, length - 1);   // reverse whole
    }

    // Method to reverse list from start to end
    static <T> void reverseList(List<T> list, int start, int end){
        // Swapping each element with its respective opposite element
        while (start < end) {
            Collections.swap(list, start++, end--);
        }
    }
}
/*
Before rotate: [10, 20, 30, 40, 50]
After rotation by 2: [40, 50, 10, 20, 30]
 */