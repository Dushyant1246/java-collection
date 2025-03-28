package com.bridgelabz.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        System.out.println("Word Frequency Counter: " + WordFrequencyCounter.countWords(text));
    }

    // Method to count words in a string
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.toLowerCase().replaceAll("[^a-z ]", "").split(" ");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }
}
/*
Word Frequency Counter: {world=1, java=1, hello=2}
 */