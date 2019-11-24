package com.class17;

import com.sun.tools.javac.Main;

public class Dog {
//Create a Dog Class and create 3 different objects of it: 
	// Husky, Bulldog, Labrador with specific attributes and behaviors.

	String hunts, name, barks;
	int weight, height;
	boolean isTraine;

	void runs() {
		System.out.println("My dog " + name+" whose weight is "+weight+" and having heigth "+ height + hunts);
	}

	void barks() {
		System.out.println("My "+ name+ hunts);
	}

	void hunts() {
		System.out.println(name +" is a very good breed "+ " specially "+barks);

	}

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.hunts = "is trained in hunting";
		dog1.name = "Husky";
		dog1.weight = 30;
		dog1.barks = "barks at night";
		dog1.height = 80;
		dog1.isTraine = true;

		dog1.hunts();
		dog1.barks();
		dog1.runs();
		System.out.println(" -----------------DOG2--------------------------------------------");

		Dog dog2 = new Dog();
		dog2.hunts = "is  not trained in hunting";
		dog2.name = "Bulldog";
		dog2.weight = 40;
		dog2.barks = "does not bark at night";
		dog2.height = 60;
		dog2.isTraine = false;

		dog2.hunts();
		dog2.barks();
		dog2.runs();

		System.out.println("=================DOG3====================================================");
		
		Dog dog3 = new Dog();
		dog3.hunts = "is under training in hunting";
		dog3.name = "Bulldog";
		dog3.weight = 50;
		dog3.barks = "does not bark at night";
		dog3.height = 60;
		dog3.isTraine = false;

		dog3.hunts();
		dog3.barks();
		dog3.runs();
	}
}
