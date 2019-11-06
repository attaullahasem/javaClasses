package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {

// int []nums=new int[2147483647];// compiller will compile that value is out of range

		int[] nums = new int[4];
		nums[0] = 12;
		nums[1] = 13;
		nums[2] = 14;
		nums[3] = 15;
		// to find number of elements we use .length
		System.out.println(nums.length); // it shows how many indexes or values we have

		// lets create an array od Strings
		// indexes            0         1        2         3
		String [] array= { "Winter", "Falls", "Summer", "Spring"};
		System.out.println(" I was born in "+ array[2]);
		
		// array.length will return an integer
		int arraySize=array.length;
		System.out.println(arraySize);
		
		//
		//instead of writing, int score=80, int score 80, we can sim;y write
		
		int [] score= {80,90,70,100,99};
		
		
	}
}
