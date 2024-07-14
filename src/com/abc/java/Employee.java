package com.abc.java;
import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    private Address address;

    public Employee(int id, String name, Address address) {
        this.address=address;
        this.id=id;
        this.name=name;
    }

    // Constructor, getters, and setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
               Double.compare(employee.salary, salary) == 0 &&
               Objects.equals(name, employee.name) &&
               Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, department);
    }
}
