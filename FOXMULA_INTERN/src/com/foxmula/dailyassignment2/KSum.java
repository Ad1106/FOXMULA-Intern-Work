/**
 * 
 */
package com.foxmula.dailyassignment2;

import java.util.ArrayList;

/**
 * @author Adarsh Shukla
 *
 */
public class KSum 
{
	java.util.List<Integer> aList = new ArrayList<Integer>();
	
	public KSum(int s1, int s2, int s3, int s4, int s5)
	{
		//Initialize array list
        aList.add(s1);
	    aList.add(s2);
	    aList.add(s3);
	    aList.add(s4);
	    aList.add(s4);
	    aList.add(s5);
	}
	
	    // Naive method to find a pair in an array with a given sum
	    void logic(int sum)
	    {
	        // consider each element except the last
	        for (int i = 0; i < aList.size() - 1; i++)
	        {
	            // start from the i'th element until the last element
	            for (int j = i + 1; j < aList.size(); j++)
	            {
	                // if the desired sum is found, print it
	                if (aList.get(i) + aList.get(j) == sum)
	                {
	                    System.out.println("Pair found (" + aList.get(i) + ", " + aList.get(j) + ")");
	                    return;
	                }
	            }
	        }
	 
	        // we reach here if the pair is not found
	        System.out.println("Pair not found");
	    }
}
