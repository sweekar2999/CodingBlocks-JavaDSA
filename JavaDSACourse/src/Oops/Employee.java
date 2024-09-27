package Oops;

import java.util.*;

// Main class
public class Employee {  // Change class name from Main to Employee
    // Employee class (inner static class)
    static class Person {
        String name;
        int age;
        double salary;

        // Constructor
        Person(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name + " (Age: " + age + ", Salary: $" + salary + ")";
        }
    }

    // Comparator to sort by salary (descending) and age (ascending)
    static class SalaryComparator implements Comparator<Person> {
        @Override
        public int compare(Person e1, Person e2) {
            // First, compare by salary (higher salary comes first)
            if (e1.salary != e2.salary) {
                return Double.compare(e2.salary, e1.salary); // Descending order
            }
            // If salary is the same, compare by age (younger age comes first)
            return Integer.compare(e1.age, e2.age); // Ascending order
        }
    }

    public static void main(String[] args) {
        // List of employees
        List<Person> employees = new ArrayList<>();
        employees.add(new Person("Alice", 30, 50000));
        employees.add(new Person("Bob", 28, 60000));
        employees.add(new Person("Charlie", 25, 60000));
        employees.add(new Person("David", 30, 40000));

        System.out.println("Before sorting:");
        for (Person emp : employees) {
            System.out.println(emp);
        }

        // Sort the employees using the SalaryComparator
        Collections.sort(employees, new SalaryComparator());

        System.out.println("\nAfter sorting by salary (descending) and age (ascending):");
        for (Person emp : employees) {
            System.out.println(emp);
        }
    }
}
