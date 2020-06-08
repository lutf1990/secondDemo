package com.demo;

public class CountOccurances {

	public static void main(String[] args) {
		

		String str = "HOW MANY TIMES EVERY LETTERS HAVE REPEATED";
		char c;
		int array [] = new  int [256];
		for(int i=0;i<str.length();i++) {
			array[str.charAt(i)]++;
		}
		for(int i=0;i<256;i++) {
			
			if(array[i]!=0) {
			c=(char)(i);
			System.out.println(c+" occured " +array[i]);	
			}
		
		}
		
	}
	
}	
		
		
