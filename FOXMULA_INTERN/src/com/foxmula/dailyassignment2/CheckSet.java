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
	
	public CheckSet(String s1, String s2, String s3, String s4, String s5)
	{
		set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
	}
	
	void check(String s)
	   {
		   System.out.println("The element " + s + " in Set? " + set.contains(s));
	   }

}
