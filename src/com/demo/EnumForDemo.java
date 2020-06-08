package com.demo;

public class EnumForDemo {

	static enum Ranks {
		PRIVATE, CAPTAIN, MAJOR, COLONEL, FULLBIRDCOLONEL, GENERAL, MAJORGENERAL
	}

	public static void main(String[] args) {

		Ranks r = Ranks.MAJOR;
		//System.out.println(r);

		switch (r) {
		case PRIVATE:
			System.out.println(   " YOU ARE A LOW RANK");
			break;
		case CAPTAIN:
			System.out.println(   " YOU ARE A PLATOON LEADER");
			break;
		case MAJOR:
			System.out.println(   " YOU ARE A COMPANY COMMANDAR");
			break;
		case COLONEL:
			System.out.println(   " YOU CAN BE A BITALION COMMANDER ");
			break;
		default:
			System.out.println("  your rank is not clear ");
		}
	}

}
