package com.demo;
interface Supplier<T>{
	public void eat(String name);
}


// (1)demo of consumer
//(2) demo of supplier
public class LambdaDemo {

	public static void main(String[] args) {
		// Consumer<String> consume = new Consumer<String>() {

			//@Override
			//public String eat(String name) {
				//return "My name is from abstract method";
			//}
		//};
		// here is Lambda of 
		// Consumer<String> consume = (String)-> "My name is from abstract method";
	
	Supplier<String> sup = new Supplier<String>() {

		@Override
		public void eat(String name) {
        
		}
	};
	sup.eat("nagindera");
	}
}
