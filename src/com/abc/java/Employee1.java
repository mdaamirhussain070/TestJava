package com.abc.java;

public class Employee1 {
	private String empID;
	private String name;
	private String department;
	
	
	public Employee1(String empID, String name, String department) {
		super();
		this.empID = empID;
		this.name = name;
		this.department = department;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public boolean equals(Object obj) {
		 if (obj == this)
	            return true;
	        if (!(obj instanceof Employee1))
	            return false;
	        Employee1 employee = (Employee1) obj;
	        return employee.getEmpID() == this.getEmpID()
	                && employee.getName() == this.getName() && employee.getDepartment()==this.getDepartment();
	}
	@Override
	public String toString() {
		return "Employee1 [empID=" + empID + ", name=" + name + ", department=" + department + "]";
	}
	
	

}
