package com.bridgelabz.mapInterface;

import java.util.*;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class EmployeeGrouper {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );
        System.out.println("Grouped Employees: " + EmployeeGrouper.groupByDepartment(employees));
    }

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> groupedEmployees = new HashMap<>();

        for (Employee emp : employees) {
            groupedEmployees.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        return groupedEmployees;
    }
}
/*
Grouped Employees: {HR=[Alice, Carol], IT=[Bob]}
 */