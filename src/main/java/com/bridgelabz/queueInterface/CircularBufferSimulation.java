package com.bridgelabz.queueInterface;

import java.util.LinkedList;
import java.util.Queue;

class CircularBuffer {
    private final int size;
    private final Queue<Integer> buffer;

    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new LinkedList<>();
    }

    public void insert(int value) {
        if (buffer.size() == size) {
            buffer.poll(); // Remove oldest element if full
        }
        buffer.add(value);
    }

    public void printBuffer() {
        System.out.println("Buffer: " + buffer);
    }
}

public class CircularBufferSimulation {
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.printBuffer();

        cb.insert(4);
        cb.printBuffer();
    }
}
/*
Buffer: [1, 2, 3]
Buffer: [2, 3, 4]
 */