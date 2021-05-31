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
		
		public OccuranceArrayList(int n1, int n2, int n3, int n4, 
								  int n5, int n6, int n7, int n8, int n9)
		{
			//Initialize array list
	        aList.add(n1);
		    aList.add(n2);
		    aList.add(n3);
		    aList.add(n4);
		    aList.add(n5);
		    aList.add(n6);
		    aList.add(n7);
		    aList.add(n8);
		    aList.add(n9);
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