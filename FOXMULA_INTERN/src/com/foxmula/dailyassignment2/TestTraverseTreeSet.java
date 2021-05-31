/**
 * 
 */
package com.foxmula.dailyassignment2;

import java.util.Scanner;

/**
 * @author Adarsh Shukla
 *
 */
public class TestTraverseTreeSet 
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner (System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
	
		TraverseTreeSet   t = new TraverseTreeSet(n1,n2,n3,n4);
		
		//Traversing elements    
		t.traverse();
		
		sc.close();
	
	}
}
