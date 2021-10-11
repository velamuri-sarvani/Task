package com.basic;

public class point {

private int x,y;

	//Defining the parameterized constructor
	public point(int x1,int y1) {
		x= x1;
		y=y1;
	}

	//Defining the display method
	public String getDetails()
	{
	   return "Point ("+x+","+y+")";
	}
}