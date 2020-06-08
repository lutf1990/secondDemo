package com.demo;

public class CountLetterOccurance {

	public static void main(String[] args) {

		
		StringBuilder stb = new StringBuilder("Jamshid Noorzad");
		StringBuilder stb1 = new StringBuilder("Lutfurahman Momin");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(stb.reverse());
		System.out.println(stb1.reverse());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		// how to count occurance of a letter in a String
		char c;
		String name = "No one is Worthy of worship but Allah(SWT)";
		// create  an int array
		int array [] = new int [256];
		for(int i = 0;i<name.length();i++) {
			array[name.charAt(i)]++;
		}
		for(int i = 0;i<256;i++) {
			if(array[i]!=0) {
			c=(char)(i);
			System.out.println("("+c+")"+"Occured "+ array[i]+"  times");
			}
		}
	}

}
