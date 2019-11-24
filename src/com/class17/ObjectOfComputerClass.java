package com.class17;

public class ObjectOfComputerClass {

	public static void main(String[] args) {
		//to create an object we have to, specify class name, any variable name, new
		// and class name

		// ClassName variable=new ClassName();
		// String str=new string ();

		Computer Pc = new Computer();
		
		Pc.keyboard=true;
		Pc.monitor=15;
		Pc.screen=11;
		Pc.mouse=true;
		Pc.name="HP";
		Pc.ram=16;
		Pc.memory=500;
		
		// to print i have Hp computer with ram 16 and memory of 300
		
System.out.println("I have a compter with a ram of " + Pc.ram+ " and memory of "+ Pc.memory +"gb");
	}

}
