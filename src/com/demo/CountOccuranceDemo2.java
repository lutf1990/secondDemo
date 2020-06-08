package com.demo;

public class CountOccuranceDemo2 {

	public static void main(String[] args) {
		
		/*
		 * String str = "Hello /''Worldaa"; int arr[] = new int[256]; char c;
		 * 
		 * for(int i=0;i<str.length();i++) { arr[str.charAt(i)]++;
		 * 
		 * }
		 * 
		 * for(int i=0;i<256;i++) { if(arr[i]!=0) { c=(char)(i);
		 * System.out.println(c+" "+arr[i]); }}
		 */
		String str = "Hi My Name Is Lutfurhaman Momin";
		int array []= new int [256];
		char c;
		for(int i=0;i<str.length();i++) {
			array[str.charAt(i)]++;
			
		}
		for(int i=0;i<256;i++) {
			if(array[i]!=0) {
				c=(char)(i);
				System.out.println("letter counts "+c+"=="+array[i]);
			}
		}

    }
}
