package com.bridgelabz.insurancePolicyManagementSystem;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PerformanceComparison {
    public static void comparePerformance() {
        Set<InsurancePolicy> hashSet = new HashSet<>();
        Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
        Set<InsurancePolicy> treeSet = new TreeSet<>();

        // Sample policy for testing
        InsurancePolicy samplePolicy = new InsurancePolicy("P1001", "Alice Brown", "2025-12-31", "Health", 1500.00);

        // Measure time for adding
        long start = System.nanoTime();
        hashSet.add(samplePolicy);
        long end = System.nanoTime();
        System.out.println("HashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.add(samplePolicy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.add(samplePolicy);
        end = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end - start) + " ns");

        // Measure time for searching
        start = System.nanoTime();
        hashSet.contains(samplePolicy);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains(samplePolicy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(samplePolicy);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) + " ns");
    }
}
