package com.class22;

public class StaticVsNonStatic {
// template for a student( school, name, grade)
	static String school="Syntax";
	String name;
	char grade;
	
	// instance method
	
	void getInfo() {
		System.out.println("My name is "+name+ " and I am going to "+ 
	school+" and my grade us "+ grade);
			
	}
	// static method
	static void getInfo1() {
		System.out.println(" I am attedning classes at "+ school);
		/* 
		 * you CANNOT access NON static members within STATIC methods
		 * if we add NON static variable compiler will give error
		 */
	}
	public static void main(String[] args) {
		/*accessing static members within same class
		 * --> just use name for a variable
		 * or call method by its name only
		 */
		System.out.println(school);
		getInfo1();
		
	}
}
