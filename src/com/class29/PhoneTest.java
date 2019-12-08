package com.class29;

public class PhoneTest {

	public static void main(String[] args) {
		// you can not directly create an object of an abstract classs
		// Phone phone=new Phone(); compiler can not instanciate
// we can create it directly
		Phone phone=new iPhone();
		
		phone.makeCall();
		phone.makeCall();
		phone.takePictures();
		phone.playGames();
	}

}
