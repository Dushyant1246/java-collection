package com.bridgelabz.insurancePolicyManagementSystem;

public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        // Adding sample policies
        manager.addPolicy(new InsurancePolicy("P1001", "Alice Brown", "2025-12-31", "Health", 1500.00));
        manager.addPolicy(new InsurancePolicy("P1002", "Bob Smith", "2024-04-20", "Auto", 2000.00));
        manager.addPolicy(new InsurancePolicy("P1003", "Carol White", "2024-05-10", "Home", 2500.00));
        manager.addPolicy(new InsurancePolicy("P1004", "David Black", "2024-03-25", "Health", 1800.00));

        // Displaying policies
        manager.displayAllPolicies();
        manager.displayExpiringSoon();
        manager.displayPoliciesByCoverage("Health");
        manager.findDuplicatePolicies();

        // Performance comparison
        System.out.println("\nPerformance Comparison:");
        PerformanceComparison.comparePerformance();
    }
}
/*
All Policies (HashSet):
Policy No: P1001, Holder: Alice Brown, Expiry: 2025-12-31, Coverage: Health, Premium: $1500.0
Policy No: P1002, Holder: Bob Smith, Expiry: 2024-04-20, Coverage: Auto, Premium: $2000.0
Policy No: P1004, Holder: David Black, Expiry: 2024-03-25, Coverage: Health, Premium: $1800.0
Policy No: P1003, Holder: Carol White, Expiry: 2024-05-10, Coverage: Home, Premium: $2500.0

Policies Expiring Soon:
Policy No: P1004, Holder: David Black, Expiry: 2024-03-25, Coverage: Health, Premium: $1800.0
Policy No: P1002, Holder: Bob Smith, Expiry: 2024-04-20, Coverage: Auto, Premium: $2000.0
Policy No: P1003, Holder: Carol White, Expiry: 2024-05-10, Coverage: Home, Premium: $2500.0

Policies with Coverage Type: Health
Policy No: P1001, Holder: Alice Brown, Expiry: 2025-12-31, Coverage: Health, Premium: $1500.0
Policy No: P1004, Holder: David Black, Expiry: 2024-03-25, Coverage: Health, Premium: $1800.0

Duplicate Policies:

Performance Comparison:
HashSet Add Time: 4300 ns
LinkedHashSet Add Time: 1200 ns
TreeSet Add Time: 5500 ns
HashSet Search Time: 15800 ns
LinkedHashSet Search Time: 600 ns
TreeSet Search Time: 7800 ns
 */