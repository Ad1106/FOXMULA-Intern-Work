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
	
    public TraverseTreeSet (int n1, int n2, int n3, int n4)
    {
	    ts.add(n1);
	    ts.add(n2);
	    ts.add(n3);
	    ts.add(n4);  
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
