package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

interface Lists{
	
	List<String> name = new ArrayList<String>();
}
public class SreamAPIDemo {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>();
		myList.add("john");
		myList.add("Gulalai");
		myList.add("Rabia");
		myList.add("Nazifa");
		myList.add("john");
		myList.add("Gulalai");
		myList.add("Rabia");
		myList.add("Nazifa");
		
		Stream<String> stream = myList.stream();
		
		myList
	    .stream()
	    .skip(1)
	    .limit(1)
	    .sorted()
	    .forEach(System.out::println);
	}
}
