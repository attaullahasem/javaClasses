package com.class11;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// to declare 2D Array

		int[][] array = new int[3][4];

// 1st row
		array[0][0] = 12;
		array[0][1] = 10;
		array[0][2] = 6;
		array[0][3] = 4;
		
		// 2nd row
		array[1][0] = 10;
		array[1][1] = 5;
		array[1][2] = 7;
		array[1][3] = 8;
		
		//3rd row
		
		array[2][0] = 10;
		array[2][1] = 9;
		array[2][2] = 70;
		array[2][3] = 86;
		
		System.out.println(array[1][3]);
	
		System.out.println("*************************************************************");
		// create 2D array for String with row 2 and 3 coulmns,
		
		String [][] task=new String[2][3];
	//	row 1st
		task[0][0] ="Ali";
		task[0][1] = "Ahmad";
		task[0][2] ="Moh";
		
		
		//row 2nd
		task[1][0] ="OSMAN";
		task[1][1] = "salem";
		task[1][2] ="KHALID";
		
		System.out.println(task[0][2]);// will Moh
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		int [][]numbers= {
		        {2,3,4,5,6},
		        {3,4,5,6,9},
		        {4,5,6,7,8},
		        
		};
		 //System.out.println(" The value in index 1 and 4 is="+ numbers[1][4]);
		 
		 // To identiify the numbers in Rows
		 System.out.println("The number of Rows are:=" + numbers.length);
		 
		 // To udentify the numbers of Columns/elements in a row
		 System.out.println(" The numbers Columns are:=" + numbers[0].length);
		 System.out.println("==========================================================");
		 
		 for (int i=0; i<numbers.length; i++) {
			 for (int j=0; j<numbers[i].length; j++) {
				 System.out.println(numbers[i][j]);
				 
			 }
		 }
		}
	}


