package com.class23;

public class Student3 {
	// Tas2
//	Write a java program of Class Students that takes students name and 3 subject grades.
//	Inside your class also have a method to Calculate Average Grade. 
//	Test Student class for 5 different students with different marks. 
//	Your program should print an average mark of each students name

	String name;
	int grade1, grade2, grade3;

	Student3(String studentName, int grd1, int grd2, int grd3) {
		name = studentName;
		grade1 = grd1;
		grade2 = grd2;
		grade3 = grd3;
	}

	public void calculateAverage() {
		int Averag = (grade1 + grade2 + grade3) / 3;
		System.out.println("My name is " + name + " and i got average grade " + grade1);
	}

	public static void main(String[] args) {

		Student3 obj = new Student3("Ali", 75, 85, 95);
		obj.calculateAverage();

		Student3 obj1 = new Student3("Rehana", 80, 70, 90);
		obj1.calculateAverage();
		Student3 obj3 = new Student3("Wasim", 60, 70, 80);
		obj3.calculateAverage();

	}
}
