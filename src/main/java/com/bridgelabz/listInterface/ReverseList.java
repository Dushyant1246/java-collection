package com.bridgelabz.listInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    // Method to reverse any type of list (linked list or array list)
    static <T> void reverseList(List<T> list){
        int length = list.size();
        for (int i = 0 ; i < length / 2 ; i++){
            // Swapping each element with its respective opposite element
            T temp = list.get(i);
            list.set(i, list.get(length - 1 - i));
            list.set(length - 1 - i, temp);
        }
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Array List: " + arrayList);
        System.out.println("Linked List: " + linkedList);

        reverseList(arrayList);
        reverseList(linkedList);

        System.out.println("After reversing");
        System.out.println("Array List: " + arrayList);
        System.out.println("Linked List: " + linkedList);
    }
}
/*
Array List: [1, 2, 3, 4, 5]
Linked List: [1, 2, 3, 4, 5]
After reversing
Array List: [5, 4, 3, 2, 1]
Linked List: [5, 4, 3, 2, 1]
 */