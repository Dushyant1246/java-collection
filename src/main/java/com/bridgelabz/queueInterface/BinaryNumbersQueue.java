package com.bridgelabz.queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbersQueue {
    public static void main(String[] args) {
        int N = 5;
        generateBinaryNumbers(N);
    }

    // Method to generate binary numbers using queue
    static void generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < N; i++) {
            String binary = queue.remove();
            System.out.print(binary + " ");
            queue.add(binary + "0");
            queue.add(binary + "1");
        }
    }
}
/*
1 10 11 100 101
 */