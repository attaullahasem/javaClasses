package com.class7;

public class IncrementAndDecrement {
public static void main(String[] args) {
	
	int a=10;
	a=a+1;// assignment
	a+=1;// shorthand
	
	
	System.out.println(a);//12
	
	a++;// increment operator
	
	System.out.println(a);//
	
	int b=10;
	b-=1;// 10-1
	b--;// decrement
	System.out.println(b);//
	
	
// with increment and decrement operators can be used only with variables
	int c=23;
	c++;//24
	// 1++; will give compiler error
}
}
