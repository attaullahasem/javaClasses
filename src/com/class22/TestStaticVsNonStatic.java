package com.class22;

public class TestStaticVsNonStatic {

	public static void main(String[] args) {
// how to access static members
		// they can be accessed by ClassName

		System.out.println(StaticVsNonStatic.school);
		StaticVsNonStatic.getInfo1();

		/*
		 * how to access non static members they can be accessed by creating an object
		 * of that class
		 */
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.name = "John";
		obj.grade = 'A';
		obj.getInfo();
		// obj.getInfor();possible, not preferable
	}
}
