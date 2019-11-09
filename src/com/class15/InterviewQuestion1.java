package com.class15;

public class InterviewQuestion1 {

	public static void main (String[] args) {
		
		int a=10;
		int b=20;
		/*
	     * Write a program to swap 2numbers with out a temporary variable? Swap 2
	     * Strings without a temporary variable?
	     */
	        a = a + b;// as declared  above in line 7, initial value of a is 10 and initial value b is 20, so a+b will
	        // be 10+20= 30
	        b = a - b;// in line 13, the value of a is re initialized and become 30 and as mentioned above in line 8 
	        // initial value b is 20, so a-b will be 30-20=10
	        
	        a = a - b;// 30=20
	        
	        // to summarize
	        // a=a+b  ==> 10+20 ==> 30, so a new value is 30
	        // b=a-b  ==> 30-20 ==> 10, so b new value is 10
	        // a=a-b  ==> 30-10 ==> 20, so a new value is 20
	        
	        System.out.println("The value of a=" + a); 
	        System.out.println("The value of b=" + b);	
	
	        
	        //Question 2
	        // swape the strings
	        
	        String str1="Hello";
	        String str2="Bye";
	        
	        str1=str1+str2;  // HelloBye
	        str2=str1.substring(0,5); // will print Hello
	        
	        str1= str1.substring(5); // 
	        
	        System.out.println("The value of str1=" +str1);
	        System.out.println("The value of str2=" +str2);
	        
	  // second way
	        String str4="Hello";
	        String str5="Welcome";  // its length is 7
	        
	        str4=str4+str5;  // HelloWelcome-----> its length is 12
	        
	        
	        str5=str4.substring(0,5); // will print Hello
	        
	        str4= str4.substring(0, str4.length()-str2.length()); // 
	        
	        System.out.println("The value of str4=" +str4);
	        System.out.println("The value of str5=" +str5);
	        
	        
	}

}
