package com.demo;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private int salary;
	
	public Employee(int id,String name,int salary) {

		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.salary-o.salary;
	}
	
	
}
