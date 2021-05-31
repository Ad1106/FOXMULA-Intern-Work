/**
 * 
 */
package com.foxmula.dailyassignment1;

/**
 * @author Adarsh Shukla
 *
 */
public class Parallelogram extends Quadrilateral  // 4th derive class
{
	private int height;
	Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int height)
	{
		super(x1,y1,x2,y2,x3,y3,x4,y4);		// call the base class's constructor
		this.height = height;
	}
	int area()
	{
		int d1= (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return (int)d1*height;		// calculate & return the area
	}
}