package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class GenericDemo {

	public static void main(String[] args) {

		Testing<String> stringTest = new Testing<String>();
		Testing<Integer> integerTest = new Testing<Integer>();
		Testing<Double> doubleTest = new Testing<Double>();

		stringTest.addTest("When were you burn ?");
		integerTest.addTest(1986);
		doubleTest.addTest(11.22);

		System.out.println(stringTest.getT());
		System.out.println("I was burn in " + integerTest.getT());
		System.out.println("It was Novemebr " + doubleTest.getT());

		Map<String, String> myMap = new TreeMap<String, String>();
		myMap.put("Manager", "Ahmad Qasim");
		myMap.put("Employee", "Ahsan");

		System.out.println(myMap);
		for (Map.Entry<String, String> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}
		ArrayList<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		// Iterator to traverse the list
		Iterator iterator = list.iterator();

		System.out.println("List elements : ");

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\n");
		}
		Set<String> sett = new TreeSet<String>();
	
		
		sett.add("Ahmad");
		sett.add("Qasim");
		sett.add("MuQadas");
		sett.add("Mursal");
		
		Iterator iterate = sett.iterator();
		while (iterate.hasNext()) 
		System.out.println(iterate.next());
	}

}
