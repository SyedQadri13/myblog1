package com.myblog.myblog1.debug;

public class Employee {

    private String name;
    private double salary;
    private int age;

    // Constructor
    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age=age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
