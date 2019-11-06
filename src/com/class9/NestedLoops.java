package com.class9;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0; i<=5; i++) {
			
			System.out.println("i");//0,1,2,3,4,5
			
		for (int j=0; j<=5; j++){// 0,1,2,3,4,5
				
		System.out.println(i + " " +j);		// it will give 00,01,02,03,04,05, 
		//11,12,13,14,15,21,23,24,25,etc
		// till the iteration finishes in inner for
				
			}
		}

	}
}


