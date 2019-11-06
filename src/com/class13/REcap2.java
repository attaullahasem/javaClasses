package com.class13;

public class REcap2 {

	public static void main(String[] args) {
		 String str1="Hello";
		 
		 String str2="Hello";
		 System.out.println(str1.contentEquals(str2));  // true
		 System.out.println(str1==str2); // true
		 
		 System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		 
		 String str3= new String("Bye");
		 String str4= new String("Bye");
		 
		 System.out.println(str1.equals(str2));// true
		 
		 System.out.println(str1==str2);// false
		 
		 // == compares the object
		 // .equals refer to content 
		 
		 /*
	         * str.isEmpty();
	        str.length();
	    str.toUpperCase();
	    str.toLowerCase();
	    str.equals();
	    str.equalsIgnoreCase();
	    str.contains(s);
	    str.startsWith(String prefix);
	    str.endsWith(String suffix);
	    str.concat(String str);
	    str.trim();>>>>>>>>>>>>>>>>>>>>>>it removes the whte space or empty spaces
	    str.charAt(int index);
	    str.indexOf(int ch);
	         */ 
		 System.out.println(".....................trim..............................");
		//str.trim();>>>>>>>>>>>>>>>>>>>>>>it removes the white space or empty spaces 
		String str6="   It is sunny     " ;
		System.out.println(str6.trim());// will remove the spaces 
		 
		 System.out.println("....................index OF and CharAt................");
		 //  str.charAt(int index)  // will show the presence of the character in the first location
		 String str7= "Tomorrow we will be done with String Manipulation";
		 
		 System.out.println(str7.indexOf('e'));  // will show the presence of the character in the first location
		
		 System.out.println(str7.indexOf('e', 11)); // in this case we have specified the location to fine the 
		                                            //character e from index 11 onward
		 
		 System.out.println(str7.indexOf("we"));//  will give us the index of world we, that on which index the 
		                                        // world we is written in the given sentence.
		 System.out.println(str7.charAt(10));// will show us which character is on index 11
		 
		System.out.println("...................RECAP FROM DAY 12........................."); 
		
		
	}

}
