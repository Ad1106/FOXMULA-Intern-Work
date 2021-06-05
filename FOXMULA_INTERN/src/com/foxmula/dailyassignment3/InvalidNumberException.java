/**
 * 
 */
package com.foxmula.dailyassignment3;

/**
 * @author Adarsh Shukla
 *
 */
public class InvalidNumberException extends Exception 

{
	public InvalidNumberException(String s)      //String s to display message through getMessage() method
    {
        super(s);      
    }
}
