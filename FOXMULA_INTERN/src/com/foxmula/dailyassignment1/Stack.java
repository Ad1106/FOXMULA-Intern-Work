package com.foxmula.dailyassignment1;

public class Stack
{
	// A linked list node
    private class Node 
    {
        int data; // integer data
        Node link; // reference variable Node type
    }
    
    Node top; 	// create global top reference variable global
    Node head;
    
    Stack() 	// Default Constructor
    {
        this.top = null;
    }
 
    public void push(int x) // Utility function to add an element x in the stack
    {	
    	Node temp = new Node();	
 
        temp.data = x;    // initialize data into temp data field
        temp.link = top;  // put top reference into temp link
 
        top = temp;		// update top reference
    }
 
    public void pop() // Utility function to pop top element from the stack
    {
        if (top == null)      // check for stack underflow
        {
            System.out.print("\nStack Underflow");
            return;
        }
        else
        {
        	System.out.println("Poped element : "+ top.data);
            top = top.link;    // update the top pointer to point to the next node
        }
    }
    
    public boolean isEmpty() // Utility function to check if the stack is empty or not
    {
        return top == null;
    }
 
	public int count()      //Utility function for count the number of elements in stack
	{     
		  int count = 0;
		  Node temp=top;
		  while(temp!=null)
		  {
		   temp=temp.link;
		   count++;  
		  }
		  return count;
	}
	
	public void display(Stack St1, Stack St2)   //Function for compare the number of elements in both stack
	{
		if(St1.count()==St2.count())
		{
			System.out.println("Total number of elements in both stack are same: "+St1.count());
		}
	}
}
