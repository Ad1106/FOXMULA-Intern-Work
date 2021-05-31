/**
 * 
 * Write a program to calculate occurrences of each element of an array list.
 * 
 */
package com.foxmula.dailyassignment2;

import java.util.ArrayList;

/**
 * @author Adarsh Shukla
 *
 */
public class OccuranceArrayList 
{		
		java.util.List<Integer> aList = new ArrayList<Integer>();
		
		public OccuranceArrayList()
		{
			//Initialize array list
	        aList.add(1);
		    aList.add(2);
		    aList.add(8);
		    aList.add(3);
		    aList.add(2);
		    aList.add(2);
		    aList.add(2);
		    aList.add(5);
		    aList.add(1);
		}
		
		void frequency()
		{
			//Array fr will store frequencies of element  
			
			int [] fr = new int [aList.size()];   
			int visited = -1, count = 1; 
	        
	        for(int i = 0; i < aList.size(); i++)
	        {   
	            for(int j = i+1; j < aList.size(); j++)
	            {  
	                if(aList.get(i) == aList.get(j))
	                {  
	                    count++;  
	                    //To avoid counting same element again  
	                    fr[j] = visited;  
	                }  
	            } 
	            
	            if(fr[i] != visited)  
				{
	                fr[i] = count;  
				}
	        }  
			//Displays the frequency of each element present in array  
	       
	        System.out.println(" Element | Frequency");  
	        System.out.println("---------------------------------------"); 
	        
	        for(int i = 0; i < fr.length; i++)
	        {  
	            if(fr[i] != visited)  
				{
	                System.out.println("    " + aList.get(i) + "    |    " + fr[i]); 
				}					
	        }  
	        
		}
}