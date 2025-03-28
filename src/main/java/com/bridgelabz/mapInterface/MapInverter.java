package com.bridgelabz.mapInterface;

import java.util.*;

public class MapInverter {

    public static void main(String[] args) {
        Map<String, Integer> mapToInvert = new HashMap<>();
        mapToInvert.put("A", 1);
        mapToInvert.put("B", 2);
        mapToInvert.put("C", 1);
        System.out.println("Inverted Map: " + MapInverter.invertMap(mapToInvert));
    }

    // Method to invert a map
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> inputMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            invertedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        return invertedMap;
    }
}
