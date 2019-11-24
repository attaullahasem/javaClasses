package com.class18;

public class Hello {

	void sayHello(String name) {
		System.out.println("Hello"+name);
	}

	public static void main(String[] args) {
		Hello obj = new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Weqas");
		obj.sayHello("Diego");

		obj.sayNameAndAge("Jack", 45);
		obj.sayNameAndAge("Olga", 50);
		
	}

	/*
	 * create a method that will say hello in different languages based on the value
	 * that will be passed when user calls a method
	 */

	void sayHelloDifferentLanguage(String country) {
		//String country = "USA";
		switch (country.toLowerCase()) {
		case "USA":
			System.out.println("Hello");
			break;
		case "Russia":
			System.out.println("Privet");
			break;
		case "Paraguay":
			System.out.println("Pershendetje");
			break;
		default:
			System.out.println("I do not know how to say hello in your langauge");
		}
	}
	
	// method to say name and age
	
	void sayNameAndAge( String name, int age) {
		System.out.println(" My name is" +name+" and I am"+age+"year old");
		}
	// create a method that will check if it is snowing
	// if snow----> stay at home, otherwise go for a walk
	
	void isSnowing(boolean isSnowing) {  // method header
		// method body
		if(isSnowing) {
			System.out.println("Stay home");
		}else {
			System.out.println("Go for a walk");
		}
	}
	
}
