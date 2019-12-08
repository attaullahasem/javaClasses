package com.class25_1;

public class Task2 {

	private void method(String str) {
		System.out.println(str);
	}
	private void method(String a, String b) {
		System.out.println(a+" "+b);
	}
	private void method(int num1, int num2) {
		System.out.println(num1+" "+num2);
	}
	public static void main(String[] args) {
		Task2 obj=new Task2();
		obj.method("Asim");
		obj.method("Ali", "Rehan");
		obj.method(20, 40);
	}
}
