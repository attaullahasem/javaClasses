package com.class08;

public class Practice2 {

	public static void main(String[] args) {
		//  write a code to find the sum of even and odd numbers from 1 to 20
		// expecting 2 out puts, sum for odd and sum for even

		int sumEven=0;
		int sumOdd=0;
		for( int i=1; i<=20; i++) {//1/2/3/4
			
			if(i%2==0) {
				sumEven=sumEven+i;//0+2=2+4=6
				
			}else {
				sumOdd=sumOdd+i;//0+1=1+3=4
			}
		}
		System.out.println(" The total of all even#=" +sumEven);
		System.out.println(" The total of all odd#=" +sumOdd);
	}
	}
