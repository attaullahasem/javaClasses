package com.class03;

public class RelationalOperators {

	public static void main(String[] args) {
	
		int num1=20;
		int num2=19;
		System.out.println(num1>num2);// true
		System.out.println(num1<num2);//false
System.out.println("**********************");

        double d=1.99;
        double d1=2.99;
        boolean b=d>d1;
        
        System.out.println(b);// false

        boolean b1=d<d1;
        boolean b2=d==d1;
        boolean b3=d!=d1;
        System.out.println(b1);// true
        System.out.println(b2);// false
        System.out.println(b3);// true
		
        System.out.println("+++++++++++++++++++++++");
        
        double c1=15;
        double c2= 11;
        
        boolean e=c1<c2;
        boolean e1=c1==c2;
        boolean e2=c1!=c2;
	System.out.println(e);//false
	System.out.println(e1);//false
	System.out.println(e2);//true
        
	System.out.println("=======================");      
	
	
	    int a=90;
	    int c=300;
	
	// if number a is bigger than number b
	// i want print a is larger than b
	
	if(a>c) {
		
		System.out.println("a is larger than c");
	}else {
		System.out.println("a is smaller than c");
		
		
	}
		
	}

}
