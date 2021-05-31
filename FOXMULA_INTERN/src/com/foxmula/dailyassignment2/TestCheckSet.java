/**
 * 
 */
package com.foxmula.dailyassignment2;

import java.util.Scanner;

/**
 * @author Adarsh Shukla
 *
 */
public class TestCheckSet 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		String s4 = sc.nextLine();
		String s5 = sc.nextLine();
		
		CheckSet t = new CheckSet(s1,s2,s3,s4,s5);
		t.check("CSF");
	    t.check("CSE");
	    
	    sc.close();

	}

}
