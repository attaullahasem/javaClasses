package com.class25_1;

public class Task {

	public void multiplication(double l, double w) {
		System.out.println(l*w);
	}
	public void multiplication( int l, int w) {
		System.out.println(l*w);
	}
	public void multiplication(int l, int w, int h) {
		System.out.println(l*w*h);
	}
	public static void main(String[] args) {
		
		Task obj=new Task();
		obj.multiplication(2.2,4.2);
		obj.multiplication(5, 5);
		obj.multiplication(2, 3, 4);		
	}
}
