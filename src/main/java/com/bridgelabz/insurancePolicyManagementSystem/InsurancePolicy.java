package com.bridgelabz.insurancePolicyManagementSystem;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class InsurancePolicy implements Comparable<InsurancePolicy> {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    // Constructor
    public InsurancePolicy(String policyNumber, String policyholderName, String expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        try {
            this.expiryDate = new SimpleDateFormat("yyyy-MM-dd").parse(expiryDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // Getters
    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyholderName() { return policyholderName; }
    public Date getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }
    public double getPremiumAmount() { return premiumAmount; }

    // Implement Comparable for TreeSet sorting by expiry date
    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return "Policy No: " + policyNumber + ", Holder: " + policyholderName + ", Expiry: " + new SimpleDateFormat("yyyy-MM-dd").format(expiryDate) + ", Coverage: " + coverageType + ", Premium: $" + premiumAmount;
    }
}
