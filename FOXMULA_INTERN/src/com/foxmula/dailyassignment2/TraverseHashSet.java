/**
 * 
 * Write a program to traverse HashSet.
 * 
 */
package com.foxmula.dailyassignment2;

import java.util.*;  

/**
 * @author Adarsh Shukla
 *
 */
public class TraverseHashSet 
{
 
		HashSet<String> set=new HashSet<String>();  
		
	    public TraverseHashSet (String s1, String s2, String s3, String s4, String s5)
	    {
	    	set.add(s1);
	        set.add(s2);
	        set.add(s3);
	        set.add(s4);
	        set.add(s5);    
	    }
	    
	    void traverse()
	    {
	    	Iterator<String> itr=set.iterator();    
	    	while(itr.hasNext())
	        {    
	           System.out.println(itr.next());    
	         
	        }  
	    }
}
