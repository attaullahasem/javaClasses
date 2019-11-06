package com.class1;

public class DataTypes {

	public static void main(String[] args) {
		
		// data types with numbers
		// specify data type (byte, or int or short etc), then variable name a, b,c or x, y or x and then assign value.
		byte b=10;
		byte b1=127; // if we put 128 the it will give error because byte range is from -128 to 127
		
		short s= 6566;
		short s1=32767; // if we put 6564 then it will give error because short range is from 6566 to 32767
		
		int i= 767787;
		long l=5765765757576l;
		long l1= 76878787555875l;
		
		// family with floating/decimal
		
		float f=12.78f;
		double d=12.766578654366894;// double can hold way longer number compared to float
		
		// boolean data type, it is only used for TRUE or FALSE
		
		boolean hungary= true;
		boolean rain=false;
		
		// data type to store single character
		
		char container= 'A';
		
	System.out.println(b1);
		
		System.out.println(hungary);
		System.out.println(rain);
		System.out.println(i);	
		System.out.println(l);
		System.out.println(container);
		
	}
}
