
package com.foxmula.dailyassignment1;

/**
 * @author Adarsh Shukla
 *
 */

	public class Time /* implementation of required class */
	{
		private int hour, min, sec;
		
		public Time (int h,int m,int s)  /*parameterized constructor*/
		{
			hour=h;
			min=m;
			sec=s;
		}
		
		public Time ()   /*default or non-parameterized constructor*/
		{
			hour=0;
			min=0;
			sec=0;
		}
		
		public Time add(Time  tx) 
		{
			Time  t=new Time ();
			t.sec= this.sec + tx.sec;
			if(t.sec>60)
			{
				t.sec-=60;
				this.min++;
			}
			t.min = this.min + tx.min;
			if(t.min>60)
			{
				t.min-=60;
				this.hour++;
			}
			t.hour += this.hour + tx.hour;
			if(t.hour>24)
				t.hour-=24;
			return t;
		}
		
		void display(String str)
		{
			System.out.println(str + hour +":" + min +":"+sec);
		}
	}


