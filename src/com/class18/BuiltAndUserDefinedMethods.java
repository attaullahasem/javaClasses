package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {

	public static void main(String[] args) {
		
		// built in comes with Java class

		String str="Hello"; // we replace Hello by Hi
		str=str.replace("Hello", "Hi");
		System.out.println(str);
		
//		Scanner scan=new Scanner(System.in);
//		scan.nextLine();
		
		BuiltAndUserDefinedMethods obj=new BuiltAndUserDefinedMethods();
		obj.myMethod();
		
	}

	void myMethod() {
		System.out.println("This is user defined method that i created");
	}
}
