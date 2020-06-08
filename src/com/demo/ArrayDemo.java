package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayDemo {

	public static void main(String[] args) {
		String array[] = { "lutf", "rafi", "zia", "ahmad" };
		System.out.println(array);
		List<String> list = new ArrayList<>();
		for (String e : array) {
			System.out.println(e);
			System.out.println();
		}

		Employee emp = new Employee(12,"Lutfullah",15000);
		Employee emp1 = new Employee(12,"Rafiullah",11000);
		Employee emp2 = new Employee(12,"Faiz Afzali",12000);
		Employee emp3 = new Employee(12,"Ziaurahman",13000);

		Set<Employee> empList = new TreeSet<Employee>();
		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		//Collections.sort(empList);
		for (Employee emps : empList) {
			System.out.println(emps);
		}

	}
}
