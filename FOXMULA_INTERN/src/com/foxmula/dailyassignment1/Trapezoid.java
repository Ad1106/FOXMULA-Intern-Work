/**
 * 
 */
package com.foxmula.dailyassignment1;

/**
 * @author Adarsh Shukla
 *
 */
public class Trapezoid extends Quadrilateral	// 3rd base class
{
	private int height;
	Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int height)
	{
		super(x1,y1,x2,y2,x3,y3,x4,y4);			// call the base class's constructor
		this.height = height;
	}
	int area()
	{
		int d1= (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		int d2= (int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
		return (int)((d1+d2)*height)/2; 		// calculate & return the area
	}
}
