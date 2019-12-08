package com.class25_1;

public class Task1 {

	public static void method(String str) {
		System.out.println(str);
	}
	public static void method(String a, String b) {
		System.out.println(a+" "+b);
	}
	public static void method(int num1, int num2) {
		System.out.println(num1+" "+num2);
	}
	public static void main(String[] args) {
		Task1 obj=new Task1();
		obj.method("Asim");
		obj.method("Ali", "Rehan");
		obj.method(20, 40);
	}
	
}
