/**
 * 
 * Write a program to check whether set contains an element or not.
 * 
 */
package com.foxmula.dailyassignment2;

import java.util.*;

/**
 * @author Adarsh Shukla
 *
 */
public class CheckSet 
{
	Set<String> set = new HashSet<String>();
	
	public CheckSet()
	{
		set.add("Welcome");
        set.add("To");
        set.add("UPES");
        set.add("CSF");
        set.add("Branch");
	}
	
	void check(String s)
	   {
		   System.out.println("The element " + s + " in Set? " + set.contains(s));
	   }

}
