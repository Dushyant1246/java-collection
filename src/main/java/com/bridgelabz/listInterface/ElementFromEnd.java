package com.bridgelabz.listInterface;

import java.util.Arrays;
import java.util.LinkedList;

public class ElementFromEnd {

    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        System.out.println("List: " + list);
        System.out.println("2nd Last element from the list: " + getFromEnd(list, 2));
    }

    // Method to find n-th element from the end of the list
    static <T> T getFromEnd(LinkedList<T> list, int lastPos){
        while (!list.isEmpty()){
            T item = list.pollLast();
            if (lastPos == 1){
                return item;
            }
            lastPos--;
        }
        return null;
    }

}
/*
List: [A, B, C, D, E]
2nd Last element from the list: D
 */