

////////////////////////////////////////////////////////////////////////////////////////
//
//  class Name : ThisDemo
//  Input :
//  Output :
//  Description : this in java.
//  Date : 17/09/2021
//  Author Name : Hritik Takke
//
////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;

class Demo
{
	public int x, y;

	public Demo()
	{
		this.x = 0;  
		this.y = 0;
	}
	public void fun()
	{
		System.out.println("Value of X is:"+this.x);
	}
}
class ThisDemo
{
	public static void main(String arg[])
	{
 	   Demo obj = new Demo();
 	   obj.fun();
	}
}
