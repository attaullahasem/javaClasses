package com.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		// TASK1
		// create an array of chars and store grades into it A,b,c,D,E. then print a
		// grade (use 2)
		// different methods
         // lenght         0    1    2    3    4   5
		char[] grades = { 'A', 'B', 'C', 'D', 'E','F' };
		int a = 2;
		System.out.println(grades[4]);
		System.out.println(grades[2]);
		a += 2;
		System.out.println(grades[a]);
a--;//3

for (int i=1; i<grades.length; i++) {
	System.out.println(grades[i]);
	System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
	// names of animal
	
	String[] animals= {"Cat","Dog","Cow","Snake","Elephant"};
	int size=animals.length;
	for (int q=0; q<size; q++) {
		System.out.println(animals[q]+ " ");
	}
	
	
	// create an array to store 5 doubles values, print all in 1 line
	double [] values= { 1.2, 2.2, 3.3, 4.4, 5.5};
	double valuesSize= values.length;
	System.out.print(values [i]+ " ");
	
}
// 
String[] animals= {"Cat","Dog","Cow","Snake","Elephant"};
// i want to print all values from an array
// when vakues is Dog---> i love dogs


	}

}
