package com.bridgelabz.insurancePolicyManagementSystem;

import java.util.*;

public class PolicyManager {
    private Set<InsurancePolicy> hashSet = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSet = new TreeSet<>();

    // Add a policy to all sets
    public void addPolicy(InsurancePolicy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // Retrieve all unique policies
    public void displayAllPolicies() {
        System.out.println("All Policies (HashSet):");
        for (InsurancePolicy policy : hashSet) {
            System.out.println(policy);
        }
    }

    // Retrieve policies expiring within 30 days
    public void displayExpiringSoon() {
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date expiryLimit = calendar.getTime();

        System.out.println("\nPolicies Expiring Soon:");
        for (InsurancePolicy policy : treeSet) {
            if (policy.getExpiryDate().before(expiryLimit)) {
                System.out.println(policy);
            }
        }
    }

    // Retrieve policies by coverage type
    public void displayPoliciesByCoverage(String coverageType) {
        System.out.println("\nPolicies with Coverage Type: " + coverageType);
        for (InsurancePolicy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    // Find duplicate policies based on policy number
    public void findDuplicatePolicies() {
        Map<String, Integer> policyCount = new HashMap<>();
        for (InsurancePolicy policy : hashSet) {
            policyCount.put(policy.getPolicyNumber(), policyCount.getOrDefault(policy.getPolicyNumber(), 0) + 1);
        }

        System.out.println("\nDuplicate Policies:");
        for (Map.Entry<String, Integer> entry : policyCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Policy Number: " + entry.getKey() + " appears " + entry.getValue() + " times.");
            }
        }
    }
}
