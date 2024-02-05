package com.myblog.myblog1.debug;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class AverageSalaryExample {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000, 21),
                new Employee("Bob", 60000, 31),
                new Employee("Charlie", 75000, 30),
                new Employee("Jack", 100000, 39),
                new Employee("Adam", 70000, 25),
                new Employee("Nick", 72000, 24)
        );

// Average Salary
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        System.out.println("Average Salary: " + averageSalary);
//Youngest Employee
        Optional<Employee> youngestEmployee = employees.stream()
                .min(Comparator.comparingInt(Employee::getAge));

        youngestEmployee.ifPresent(employee ->
                System.out.println("Youngest Employee: " + employee.getName() +
                        ", Age: " + employee.getAge())
        );
//Oldest Employee
        Optional<Employee> oldestEmployee = employees.stream()
                .max(Comparator.comparingInt(Employee::getAge));

        oldestEmployee.ifPresent(employee ->
                System.out.println("Oldest Employee: " + employee.getName() +
                        ", Age: " + employee.getAge())
        );

//************** Min Salary *************************
        Optional<Employee> minSalary = employees.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));

        minSalary.ifPresent(employee ->
                System.out.println("Minimum Salary: " + employee.getName() +
                        ", Salary: " + employee.getSalary())
        );

// **********************Max Salary********************
        Optional<Employee> maxSalary = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        maxSalary.ifPresent(employee ->
                System.out.println("Maximum Salary: " + employee.getName() +
                        ", Salary: " + employee.getSalary())
        );
        //************************Salary increment by 10%**************************

        double oldSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum(); // or use .toArray() or other terminal operation based on your requirement
        System.out.println("Old Salary");
        employees.forEach(employee -> System.out.println(employee.getName() + ": " + employee.getSalary()));
        System.out.println("New Salary --- ");
        employees.stream()
                .map(employee -> {
                    employee.setSalary(employee.getSalary() * 1.1);
                    return employee;
                })

                .forEach(employee -> System.out.println(employee.getName() + ": " + employee.getSalary()));
    }


    }

