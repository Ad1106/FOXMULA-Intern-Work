/**
 * 
 * Write a program to check whether an array list contains an element or not.
 * 
 */
package com.foxmula.dailyassignment2;

import java.util.ArrayList;

/**
 * @author Adarsh Shukla
 *
 */

public class CheckArrayList 
{
	java.util.List<String> aList = new ArrayList<String>();
	public CheckArrayList()
	   {
		 
	      aList.add("A");
	      aList.add("B");
	      aList.add("C");
	      aList.add("D");
	      aList.add("E");
	   }
	   
	   void check(String s)
	   {
		   System.out.println("The element " + s + " in ArrayList? " + aList.contains(s));
	   }
	}