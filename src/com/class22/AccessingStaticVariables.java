package com.class22;

public class AccessingStaticVariables {

	public static void main(String[] args) {
		
		Husky obj=new Husky();
		System.out.println(obj.name);// will give null becasue it is no value in 
		                           //class Husky
		System.out.println(Husky.breed); // possible but 
	}
}
