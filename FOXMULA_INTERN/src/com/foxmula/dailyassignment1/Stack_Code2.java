

/**
 * @author Adarsh Shukla
 *
 *
 *Create a class Stack that declares a stack and the methods to perform push ( ), pop ( ) and checkEmpty (
) operations on the stack. Create two stacks and write a menu-driven program to perform operations on
the two stacks. Whenever the number of elements in the two stacks becomes equal, a message should
automatically be generated displaying the number of elements in each stack.
 *
 * Use the concdpt of Stack Data Structure implemented with linked list
 */

package com.foxmula.dailyassignment1;


import java.util.*;

public class Stack_Code2     //inplementation of required class
{
		
		public static void main(String []args)    //main function 
		{
			Scanner sc = new Scanner(System.in);
			Stack S1=new Stack();     //Object declaration for Stack 1
			Stack S2=new Stack();	  //Object declaration for Stack 2
			int ch,data;
			Stack si=new Stack();
			
			while(true)
			{
				System.out.println("\n@@@@@@  Please Enter a valid choice  @@@@@@\n");
				System.out.println("\n1. Push in Stack 1");
				System.out.println("\n2. Pop in Stack 1");
				System.out.println("\n3. Push in Stack 2");
				System.out.println("\n4. Pop in Stack 1");
				System.out.println("\n5. Exit");
				
				ch=sc.nextInt();
				
				switch(ch)
				{
					case 1:
					System.out.println("Enter the data");
					data = sc.nextInt();
					S1.push(data);
					si.display(S1,S2);
					break;
					
					case 2 :
					S1.pop();
					si.display(S1,S2);
					break;
					
					case 3:
					System.out.println("Enter the data");
					data = sc.nextInt();
					S2.push(data);
					si.display(S1,S2);
					break;
					
					case 4 :
					S2.pop();
					si.display(S1,S2);
					break;
					
					case 5 :
					System.exit(0);
					break;
				}
			}
		}
}
