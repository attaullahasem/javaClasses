package com.class14;

public class StringManipulationRecap {

	public static void main(String[] args) {
		// 
String str=new String("Hello");
String str3=new String("Hello");
System.out.println(str==str3);//it will print false

System.out.println("***************************************************");

String str1="Hello";
String str2="Hello";

System.out.println(str1==str2);


System.out.println(str);// will print Hello

System.out.println(str.replaceAll("Hello", "Bye"));

System.out.println(str2);
		
	}

}
