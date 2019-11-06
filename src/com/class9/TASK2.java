package com.class9;

public class TASK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// print
		/*  * 1 row 1 coulnm, rows control col
		 *  ** 2 row 2 col
		 *  ***
		 *  ****
		 *  *****
		 *  we have 5 rows and 5 col
		 */
		
		 
		for ( int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");
		//TASK
		/* 1
		 * 12
		 * 123
		 * 1234
		 *12345
		 */
		for ( int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
		System.out.println();	
		System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		//TASK
		/* 1
		 * 22
		 * 333
		 * 4444
		 *55555
		 *666666
		 *777777
		 *8888888
		 *999999999
		 */
		
		for ( int m=1; m<=9; m++) {
			for (int j=1; j<=m; j++) {
				System.out.print(m);
			}
		System.out.println();	
	}
		}
	}
}
