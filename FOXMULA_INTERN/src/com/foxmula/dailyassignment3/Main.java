/**
 * 
 */
package com.foxmula.dailyassignment3;

import java.util.Scanner;

/**
 * @author Adarsh Shukla
 *
 */
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
			
		// Answer 2
		
		System.out.println("Enter a number");
		int n=s.nextInt();	
		CustomException O1 = new CustomException();
		O1.process(n);
			
		
		// Answer 3
		
		int arr[] = {10,20,10,10,20,5,5,5,5,5,5,5};
		int size = arr.length;
		SortbyFrequency O2 = new SortbyFrequency();
		System.out.println("\n"+"\n"+"\n");
		O2.frequencyNumber(arr,size);
		
		s.close();	
	}

}
