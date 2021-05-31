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
		
	    public TraverseHashSet ()
	    {
	        set.add("Adarsh");    
	        set.add("Keshav");    
	        set.add("Aman");    
	        set.add("Piyush");    
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
