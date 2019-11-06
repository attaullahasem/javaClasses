package com.class3;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
	double d=12;
	System.out.println(d);// 12.0
	
	//int i=12.0;// compiler will give error because the value 12.0 is a double value not int
	
	// casting: means changing/converting one type to other type
	
	byte b=127;
	int i=b;
	
	int num=123;
	double d1=num;
	System.out.println(d1);
	// narrowing or explicit or manual casting
	double d2= 123.56;
	int num2=(int)d2;
	//int num2=d3;// will give error because double value can not byte fitted in int so we have to narrow
	// the data by adding (int) in front of the data
	System.out.println(num2);// 123 and we loose 0.56
	
	int num3=789;
	byte b1=(byte)num3;
	System.out.println(b1);
	
	
	
	}

}
