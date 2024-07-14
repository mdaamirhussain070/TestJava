package com.abc.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClassEmpAdd {

    public static void main(String[] args) {

        Address ad1=new Address("Bangalore","Karbata","123456");
        Address ad2=new Address("Patna","Bihar","123457");
        Address ad3=new Address("Rachi","Jharkhan","123458");
        Address ad4=new Address("Delhi","Delhi","123459");

        Employee e1=new Employee(1,"Mukesh",ad1);
        Employee e2=new Employee(2,"Naresh",ad2);
        Employee e3=new Employee(3,"Suresh",ad3);
        Employee e4=new Employee(4,"Mahesh",ad4);

        List<Employee> employeeList= Arrays.asList(e1,e2,e3,e4);




    }
}
