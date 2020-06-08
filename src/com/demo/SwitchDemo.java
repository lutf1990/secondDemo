package com.demo;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class SwitchDemo {
    static String username="Qasimjan";
    String password="Qasimjan1123";
	
	
	public static void great() {
		System.out.println("Dear valuable Customer!\n \nWelcome to AIB Bank of Frontier :\n");
	}
	public  double consumed(double consumed,double price) {
		return consumed=consumed*price;
		
	}

	public static void main(String[] args) {
	
		great();
		
		Scanner read = new Scanner(System.in);
	    String str = read.nextLine();
	    String reverse ="";
	    for(int i=str.length()-1;i>=0;i--) {
	    	reverse=reverse+str.charAt(i);
	    }
	    System.out.println(reverse );
       
	}

}
