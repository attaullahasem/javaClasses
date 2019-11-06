package com.class11;

public class TwoDArrayTask {

	public static void main(String[] args) {
		// Create a 2D array of integer type with 3 rows and 4 columns
		//and print all values of the whole array.
		
int [][] num1= {
		{1,2,3,4},
		{10,12,14,16},
		{18,20,22,24},
};
for (int getRows[]:num1) {
for (int getCol:getRows) {
	System.out.print(getCol+" ");

}
System.out.println();
}
	}
}
