/**
 * 
 */
package com.foxmula.dailyassignment2;

import java.util.Scanner;

/**
 * @author Adarsh Shukla
 *
 */
public class TestKSum 
{
	
	public static void main (String[] args)
    {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the required sum : ");
        int sum = sc.nextInt();
        
        KSum t = new KSum();
        t.logic(sum);
        
        sc.close();
    }

}
