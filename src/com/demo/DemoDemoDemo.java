package com.demo;

public class DemoDemoDemo {

	public static void main(String[] args) {
		
        
		String str = "hello my dear friends";
		int array []= new int [256];
		char c;
		for(int i=0;i<str.length();i++) {
			array[str.charAt(i)]++;
		}
		for(int i=0;i<256;i++) {
			if(array[i]!=0) {
				
				c=(char)(i);
				
				System.out.println(c+" this letter occured ==>>> "+array[i]);
			}
		}
			
	}

}
