package com.basic;
import java.util.Scanner; // use this package to invoke the Scanner class.

public class assignment {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of point1 : "); //Taking the value of point 1
		int x,y;
		x = sc.nextInt();
		y = sc.nextInt();
		point pt = new point(x, y);


		System.out.println(pt.getDetails());

		System.out.println("Enter the values of Point2 : "); //Taking the value of point 1
		int x1,y1;
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		point pt1 = new point(x1, y1);


		System.out.println(pt1.getDetails());
	}

}