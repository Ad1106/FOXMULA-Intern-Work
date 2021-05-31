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
	   
	   public CheckArrayList(String s1, String s2, String s3, String s4, String s5) 
	   {
		   	  aList.add(s1);
		      aList.add(s2);
		      aList.add(s3);
		      aList.add(s4);
		      aList.add(s5);
	}

	void check(String s)
	   {
		   System.out.println("The element " + s + " in ArrayList? " + aList.contains(s));
	   }
	}