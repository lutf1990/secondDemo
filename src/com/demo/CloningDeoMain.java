package com.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CloningDeoMain {
	public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// Deep Copying example
		CloningDemo obj = new CloningDemo();
		obj.name = "Qasim jan";
		obj.city = "Dallas";

		// shadowing Copy Demo/ with this way we will get declared valued in previous
		// instnciation
		CloningDemo obj0 = obj;
		System.out.println(obj0.name);
		System.out.println(obj0.city);

		// here the values will be null if string if int values will be

		CloningDemo obj1 = new CloningDemo();
		System.out.println(obj1.name);
		System.out.println(obj1.city);

		// here Cloning demo is demonetrated
		
		CloningDemo obj2=(CloningDemo) obj.clone();
		System.out.println(obj2);
		System.out.println(obj2.city);
		System.out.println(obj2.name);
		
		Constructor<CloningDemo> constr = CloningDemo.class.getConstructor();
		CloningDemo obj3 = constr.newInstance();
		System.out.println(obj3);
		obj3.city="Richardson";
		obj3.name="IANT";
		System.out.println(obj3.name);
		System.out.println(obj3.city);
		
		String note = "call him on your imediate convenient";
		char c;
		int [] arr = new int [256];
		for(int i=0;i<note.length();i++) {
			arr[note.charAt(i)]++;
			System.out.println("this is String is Length is = "+i);
		}
		for(int i=0;i<256;i++) {
			
			if(arr[i]!=0){
				c=(char)(i);
				System.out.println("  This letter {( "+c+")} is occured =" + arr[i]);
				
			}
		}
			
	}

}
