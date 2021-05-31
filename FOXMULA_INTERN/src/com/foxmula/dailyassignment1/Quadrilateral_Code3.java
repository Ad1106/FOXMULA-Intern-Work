/**
 * @author Adarsh Shukla
 * 
 * Write an inheritance hierarchy for classes Quadrilateral, Trapezoid, Parallelogram, Rectangle and Square.
Use Quadrilateral as the super class of the hierarchy. The instance variables of Quadrilateral should be
the x-y coordinate pairs for the four endpoints of the Quadrilateral. Write a program that instantiates
objects of your classes and outputs each object's area (except Quadrilateral).
 * 
 * Use the concept of Inheritence
 *
 */

package com.foxmula.dailyassignment1;


class TestQuadrilateral_Code3
{
	public static void main(String []args)
	{	
		//for squre
		Squre sq=new Squre(10,10,20,10,20,5,10,20);      // Create object for squre
		System.out.println("Area of my squre is "+sq.area());   // Print the area of squre
		
		//for rectangle
		Rectangle rec=new Rectangle(5,10,20,10,3,10,10,20);		// Create object for Rectangle 
		System.out.println("Area of the my rectangle is "+rec.area());	// Print the area of Rectangle
		
		//fortrapezoid
		Trapezoid tp=new Trapezoid(10,5,20,10,20,20,10,20,80);		// Create object for Trapezoid
		System.out.println("Area of the my trapezoid is "+tp.area());	// Print the area of Trapezoid
		
		//for parallelogram
		Parallelogram pg=new Parallelogram(10,10,5,10,20,20,10,20,30);		// Create object for Parallelogram
		System.out.println("Area of the my parallelogram is "+pg.area());	// Print the area of Parallelogram
	}
}

