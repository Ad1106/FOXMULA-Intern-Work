/**
 * 
 * Write a program calculate frequency/occurrences of each element of an array and then 
 * sort by value and then print it.
 * 
 */
package com.foxmula.dailyassignment3;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author Adarsh Shukla
 *
 */
public class SortbyFrequency 
{
	void frequencyNumber(int arr[], int size)
	{
		// Creating a HashMap containing integer as a key and occurrences as a value
		HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

		for (int i=0;i<size;i++) 
		{
			if (freqMap.containsKey(arr[i])) 
			{
				// If number is present in freqMap,incrementing it's count by 1	
				freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
			}
				
			else 
			{
				// If integer is not present in freqMap, putting this integer to freqMap with 1 as it's value
				freqMap.put(arr[i], 1);
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
		
		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) 
		{
	         list.add(entry.getValue());
		}
		
		Collections.sort(list, new Comparator<Integer>() 
		{
			@Override
			public int compare(Integer o1, Integer o2) 
			{
				if(o1>o2)
					return (1);
				else if(o2>o1)
					return(-1);
				else 
					return (0);
			}
	      });
		
	      for (int i : list) 
	      {
	         for (Entry<Integer, Integer> entry1 : freqMap.entrySet()) 
	         {
	            if (entry1.getValue().equals(i)) 
	            {
	            	sortedMap.put(entry1.getKey(),i);
	            }
	         }
	      }
	      System.out.println("Formet  : "+"\n"+"Number = Frequency");
	      System.out.println(sortedMap);
	}
}
