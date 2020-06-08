package com.demo;

public class CloningDemo implements Cloneable{
	
	String city;
	String name;
	

	public CloningDemo() {
	
	System.out.println("CloningDemo Constructor");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
 
}
