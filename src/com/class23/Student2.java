package com.class23;

public class Student2 {

//	Task1
//	Write a program that will have a constructor: 
//	one with parameters and second without any parameters. 
//	Create a separate Test class where you will execute both of the constructors.
	int num;
	void test() {

	}

	Student2() {
		System.out.println("I am non parametrized constructor");
	}

	Student2(int num) {
		System.out.println(" I am parametrized constructor");
	}

	public static void main(String[] args) {

		Student2 obj1 = new Student2();
		Student2 obj2 = new Student2();

		obj1.test();
		obj2.test();

	}
}
