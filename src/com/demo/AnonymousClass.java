package com.demo;

public class AnonymousClass {

	public static void main(String[] args) {
		/*
		 * AnonymoseDemo <String>ad = new AnonymoseDemo<String>() {
		 * 
		 * @Override public void eat(String t) {
		 * 
		 * System.out.println("apple ="+t); }
		 * 
		 * };
		 * 
		 * ad.eat("from Anonymous overrides interface method");
		 */
		AnonymoseDemo<String> ad = (t) -> {
			System.out.println("apple =" + t);
		};
		ad.eat("Lambda is lambda");
	}

}
