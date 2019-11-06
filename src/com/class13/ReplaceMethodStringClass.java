package com.class13;

public class ReplaceMethodStringClass {

	public static void main(String[] args) {
		/* .replace method
		 *  this method returns a new string resulting
		 * from replacing all occurrences or oldChar
		 * in this string with newChar
		 */

		String str= "Hello Dear Dan, how are you, how you been?";
		
		System.out.println(str.replace('e', 'z'));
		
		System.out.println("...................Replace................................................");
		
		System.out.println(str.replace("Dear Dan", "Respected Ben"));
		
		
		System.out.println("....................replaceFirst............................................");
		
		System.out.println(str.replaceFirst("Dan", "Ali"));
		/* .replace ()
		 *  this method returns a new string resulting
		 * from replacing all occurrences sequence of string
		 * in this string with new newChar sequences
		 */
		System.out.println("............replaceAll...................");
		
		String str1="12-22-1990";
		
		System.out.println(str1.replace('-', '/'));// will replace both - by /
		System.out.println(str1.replaceFirst("-", "/"));
		
		String str5="HiHow1234&%$#";
		
		
		
	}

}
