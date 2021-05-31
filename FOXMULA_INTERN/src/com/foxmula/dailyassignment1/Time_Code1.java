package com.foxmula.dailyassignment1;

/**
 * @author Adarsh Shukla
 * 
 * Create a class called Time, which has three private instance variables – hour, min and sec. It contains a
method called add ( ) which takes one Time object as parameter and print the added value of the calling
Time object and passes Time object. In the main method, declare two Time objects and assign values
using constructor and call the add ( ) method.
*
*
* Use the concdpt of Operator Overloading
 */


public class Time_Code1 /* implementation of required class */
{
		
	public static void main(String []args)   /*defination of main function*/
	{
		Time  t1=new Time (5,23,12);   /*first object created*/
		Time  t2=new Time (6,38,50);   /*second object created*/
		Time  t3=t1.add(t2);				   /*add two object and store the result in third object*/
		t1.display("Time 1: ");
		t2.display("Time 2: ");
		t3.display("\nAdded time : Time 1 + Time 2  \n = ");
	}
	
}

