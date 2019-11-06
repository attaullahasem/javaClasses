package com.InterviewQuestions;

public class SwapNumbers {

	public static void main(String[] args) {
		//TASK  1. 
//		Write a program to swap 2 numbers without a temporary variable?
//		Swap 2 strings without a temporary variable?
		
		int a =20;
        int b=30;
        
        a=a+b;
        b=a-b;
        a=a-b;
          System.out.println("A is :"+ a);
          System.out.println("B is :"+ b);
		
System.out.println("************************************************************");
          String str="love"  ;
          String str1="ask"  ;
            
          str=str.replaceAll("love", "ask");
          str1=str1.replaceAll("ask", "love");
          
           System.out.println(str);     
          
           System.out.println(str1); 
	}

}
