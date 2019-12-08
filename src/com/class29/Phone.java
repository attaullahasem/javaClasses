package com.class29;

public abstract class Phone {

	// implemented methods , having implementation details
	public void makeCall() {
		System.out.println("Make call");
	}

	public void sendText() {
		System.out.println("Send Text");
	}

	// unimplemented methods
	public abstract void takePictures();

	public abstract void playGames();
}
// concrete class
class iPhone extends Phone {

	@Override
	public void takePictures() {
		System.out.println("iPhone takes pictures");
	}

	@Override
	public void playGames() {
		System.out.println("Play games on iPhone");
	}
}

class Samsung extends Phone {

	@Override
	public void takePictures() {
		System.out.println("iPhone takes pictures on Samsung");
	}
	@Override
	public void playGames() {
		System.out.println("Play games on Samsung");
	}
}