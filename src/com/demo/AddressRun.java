package com.demo;

class Addresss {

	String city;

	Addresss() {
	}

	public Addresss(String city) {
		super();
		this.city = city;
	}

}

class Student implements Cloneable {

	String name;
	Addresss address = new Addresss();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class AddressRun {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student object1 = new Student();
		object1.name = "Lutf";
		object1.address = new Addresss("Richardson");

		Student object2 = (Student) object1.clone();
		object2.name = "Faiz";
		object2.address.city = "Dallas";

		System.out.println("Name:" + object1.name + ",Address:" + object1.address.city);
		System.out.println("\n******@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*******\n");
		System.out.println("Name:" + object2.name + ",Address " + object2.address.city);

	}
}
