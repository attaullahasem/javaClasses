package com.class29;

public abstract class File {

	public abstract void openMethod();

	public void closeMethod() {
		System.out.println("This is close class");
	}

	public void editMethod() {
		System.out.println("This is Edit class");
	}
}

class JavaFile extends File {

	@Override
	public void openMethod() {
		System.out.println("Open new file");
	}
}

class WordlFile extends File {

	@Override
	public void openMethod() {
		System.out.println("Java is getting interested ");
	}
}

class PDFFile extends File {

	@Override
	public void openMethod() {
		System.out.println("Well come to Java ");
	}
}



