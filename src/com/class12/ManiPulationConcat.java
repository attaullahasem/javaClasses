package com.class12;

public class ManiPulationConcat {

	public static void main(String[] args) {
		
		String sentence=" Each day has a promise to brighten up the day,\nBut first you must allow the sun to come your way";
		System.out.println(sentence);
		
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		/*This methood appends one Stirng to the end of another
		 * The method returns a String with the value of the String passed in the method appended to teh end
		 * of the String used t invoke this method
		 */
		
		String str3="Hellow ";
		String str4="World ";
		System.out.println(str4+str3);// one way
		System.out.println(str3.concat(" " + str4));// second way
		
	}

}
