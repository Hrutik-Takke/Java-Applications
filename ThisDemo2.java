

////////////////////////////////////////////////////////////////////////////////////////
//
//  class Name : ThisDemo2
//  Input :
//  Output :
//  Description : Constructor chaining in java.
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
	   System.out.println("Default Constructor");
	}
	public Demo(int a, int b)
	{
		this();
		System.out.println("Parametrised Constructor");
		this.x = a;
		this.y = b;
	}
}

class ThisDemo2
{
	public static void main(String arg[])
	{
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(11,21);
	}
}