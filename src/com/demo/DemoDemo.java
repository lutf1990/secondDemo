package com.demo;

import java.util.Scanner;
// giving condition here in this and accessing it in a different class by instantiating its reference
public class DemoDemo {

	
	public void age() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Your Gender please :");
		scan.nextLine();
		System.out.println("Please Enter Your Age :");
		int ages =scan.nextInt();
		if(ages>18) {
			System.out.println("********************************************************");
			System.out.println("You are fully Authorized  ");
			System.out.println("********************************************************");
			
		}else if (ages==18){
			System.out.println("********************************************************");
			System.out.println(" Not Authorized yet... you are just ="+ages+" years old ");
			System.out.println("********************************************************");
			
		}else {
			System.out.println("********************************************************");
			System.out.println("Sorry you are not Authorized ");
			System.out.println("********************************************************");
			
		}
		
		
	}
}
