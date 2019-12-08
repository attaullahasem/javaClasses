package com.class25_1;

public class CanWeOverload {
// can we overload a private methods? Yes
	
	private void methodOne() {
		System.out.println("I am method one");
	}
	private void methodOne(String str) {
		System.out.println("I am method with one "+str);
		
	}
	// can we overload a main method?Yes
	
	public static void main (String str) {
		System.out.println("I am main methd with String arguments");
	}
	
	public static void main (String str,String [] arg) {
		System.out.println(" I am a main method with 2 parameters");
	}
	public static void main(String[] args) {
		System.out.println("I am a main method with a String array");
	}
}