package com.class12;

public class SingleArrayRecap {

	public static void main(String[] args) {
		
		int [] array1=new int[4];
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[3]=14;
		//System.out.println(array1[1]);
		
		for (int s=0; s<array1.length; s++) {
		System.out.println(array1[s]);
		
	}
		System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
		
		for (int i:array1) {
			System.out.println(i);
		}
	}
}
