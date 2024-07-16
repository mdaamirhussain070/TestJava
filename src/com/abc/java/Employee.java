package com.abc.java;
import java.util.Objects;

public class Employee {
    private int id;
    private String name;
 //   private double salary;
//    private String department;
    private Address address;

    public Employee(int id, String name, Address address) {
        this.address=address;
        this.id=id;
        this.name=name;
    }

    // Constructor, getters, and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }

//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
               // ", salary=" + salary +
                ", address=" + address +
                '}';
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id &&
//               Double.compare(employee.salary, salary) == 0 &&
//               Objects.equals(name, employee.name) &&
//               Objects.equals(department, employee.department);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, salary, department);
//    }
}
