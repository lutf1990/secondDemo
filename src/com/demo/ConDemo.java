package com.demo;


public class ConDemo {

int a;
String name;
static int  salary;

	ConDemo(){
		this(20);
	System.out.println("Non parameterized Constructor");
    }
   ConDemo(int a){
	   this(1500,"Paradeep");
	this.a=a;
	 System.out.println("Constructor with ONE parameter");
   }
   ConDemo(int salary,String name){
	   
	   this.salary = salary;
	   this.name=name;
	   System.out.println("Constructor with TWO parameter");
	   
   }
   public static void main(String[] args) {
	
		/*
		 * ConDemo conDemo = new ConDemo(); // ConDemo conDemo2 = new ConDemo(1500);
		 * ConDemo conDemo3 = new ConDemo(15000,"Ashuqullah");
		 * //System.out.println(conDemo2.a);
		 * System.out.println(" Employee is name is  ="+conDemo3.
		 * name+"\n Employee is Salary is ="+conDemo3.salary);
		 */
	   
	  String str = "hello World";
	  final int MAX_CHAR=256;
	  
	  int count[]=new int [MAX_CHAR];
	  int len = str.length();
	  for(int i=0;i<len;i++) {
		  count[str.charAt(i)]++;
		  System.out.println(len);
	  }
		  
		  
	  
	  
    }
}
