package com.class15;

public class StringManipultionRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//String class comes in java long package
        
        //2 ways to create a String
		
        //first way using String literal
        String str="Hello";
        
        //second way using new keyword - creating a String object
        String str1=new String("hello");
        
        System.out.println(str);
        System.out.println(str1);
        
        //find the number of characters inside the String
        int length=str.length();
        System.out.println(length);
        
        //case conversion methods/functions
        str=str.toLowerCase().toUpperCase();//HELLO
        System.out.println(str);//HELLO
	
		// verify if there is any character in the String/verify if the string is empty
		
		String myString="";  // empty value
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);// true/false
		
		String myString1=null; // no value at all, it is like declaring a variable such as
		// String=myString1;
		
		System.out.println(myString1.isEmpty());
		
		//how to verify existence of a characters in the string
		String a="Goood evening students";
		boolean exist=a.contains("student");
		System.out.println(exist);// true but if change any character to upper case then it will be false
		
		
		// .startsWith();
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("student"));	
		
		
		
	}

}
