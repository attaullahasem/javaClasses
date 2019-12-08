package com.class27;

public class Student {

	public void attendance() {
		System.out.println(" To learn Java regullart attendance is must");
	}

	public void review() {
		System.out.println("Reiew helps a lot");
	}
}

class SyntaxStudent extends Student {
	public void attendance() {
	System.out.println(" To learn Java regular attendance is must for all SDET course");
	}	
}
class collegeStudent extends Student {
	public void review() {
	System.out.println("Please don't miss Reiew classes");
}
}

class SchoolStudent extends Student {
	public void SDET() {
		System.out.println(" Its verymarket demanding courser");
	}
}
