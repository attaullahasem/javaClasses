package com.class25_1;

public class ConstructorOverLoading {
// having different amount of parameters
	ConstructorOverLoading(){
		System.out.println(" I am non-argument constructor");
	}
	ConstructorOverLoading(String str){
		System.out.println(" I am cosntructor with 1 string argument");
}
	// having different type of parameters
	ConstructorOverLoading(int num){
		System.out.println(" I am cosntructor with 1 int argument");
}
}
