package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		 
		int a;
		a=10;
		int a1=10;
		// 1 way
		int[] b;// declare an array, prefered way
		
        int c[]; // can also work but the above one is prefered
        // 2nd way
        
        b=new int[4];// initialization
        int[] array=new int[4];// all in 1 line (declaration and intialization)
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        
        System.out.println(array[2]);
       System.out.println("############################################");
        // lets create an array that will store classes we had
        String[] classes=new String[4];
        classes[0]="Java";
        classes[1]="SDLC";
        classes[2]="Manual testing";
        classes[3]="GIT";
        System.out.println("Today we have " + classes[0] + " class");
        //
        int []nums=new int[3];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        System.out.println("QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ");
        // how can i change 1 to 100
        
        nums[0]=100;
        System.out.println(nums[0]);
        System.out.println(nums[0]+nums[2]);// 103
        // the size of an array is fixed
        
        System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        String []names=new String[3];
        names[0]="Diana";
        names[1]="Seda";
        names[2]="Jaime";
       // names[3]="Olga"; during run time we will get an exception 
        //ArrayIndexOutOfBoundsException
        //
        System.out.println(names[3]);
	}
}
