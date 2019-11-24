package com.class17;

public class Phone {

	// Create a class"Phone". Create 3 Object of it:
	// iPhone, Android, Nokia with specific attributes and behaviors

	String name, brand, color;
	int screensize, memory, camerapixel;
	
void talking() {
	System.out.println(" I talk on my"+ name +brand);
}
	void watchvideos() {
		System.out.println(" I watch videos"+ brand+name);
	}
	void recording() {
		System.out.println(" I record videos with"+ brand+ name);
	}
	
	void browsing() {
		System.out.println(" I make videos with my"+name+brand+" having"+camerapixel+"pixel camera");
	}
	
	
	
	public static void main(String[] args) {

		Phone phone1 = new Phone();
		phone1.name = "iPhone";
		phone1.color = "gray";
		phone1.memory = 100;
		phone1.screensize = 6;
		phone1.brand = "Apple";
		phone1.camerapixel = 12;
phone1.talking();
phone1.watchvideos();
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

		Phone phone2 = new Phone();
		phone2.name = "Android";
		phone2.color = "Black";
		phone2.memory = 60;
		phone2.screensize = 4;
		phone2.brand = "Samsung";
		phone2.camerapixel = 8;
phone2.recording();

		System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");

		Phone phone3 = new Phone();
		phone3.name = "Android";
		phone3.color = "White";
		phone3.memory = 80;
		phone3.screensize = 5;
		phone3.brand = "Nokia";
		phone3.camerapixel = 10;
phone3.browsing();
	}

}
