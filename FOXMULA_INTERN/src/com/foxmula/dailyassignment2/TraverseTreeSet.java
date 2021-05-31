/**
 * 
 * Write a program to traverse Tree Set.
 * 
 */
package com.foxmula.dailyassignment2;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Adarsh Shukla
 *
 */
public class TraverseTreeSet 
{
	TreeSet<Integer> ts = new TreeSet<Integer>();
	
    public TraverseTreeSet ()
    {
	    ts.add(101);
	    ts.add(611);
	    ts.add(870);
	    ts.add(309);  
    }
    
    void traverse()
    {
    	// Create an Iterator over the TreeSet
        Iterator<Integer> iterator = ts.iterator();
  
        // Loop over the TreeSet values
        System.out.println("TreeSet: ");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
