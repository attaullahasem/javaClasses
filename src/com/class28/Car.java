package com.class28;

public class Car {

	String make, model;
	Car(){
		System.out.println(" I am a non argument constructo");
	}
	Car(String make, String model){
		this.make=make;
		this.model=model;
	}
}
class Tesla extends Car{
	boolean autopilot;
	Tesla (){
		System.out.println(" I am a child non argument constructor");
	}
	Tesla(boolean autopilot){
		this.autopilot=autopilot;
	}
	public void displayInfo() {
		System.out.println("Car"+make+" "+model+"has an autopilot"+ autopilot);
	}
}