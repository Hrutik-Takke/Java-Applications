

////////////////////////////////////////////////////////////////////////////////////////
//
//  class Name : Array
//  Input :
//  Output :
//  Description : Array creation in java using ( Member Initialisation list).
//  Date : 17/09/2021
//  Author Name : Hritik Takke
//
//////////////////////////////////////////////////////////////////////////////////////// 

 import java.lang.*;
 import java.util.Scanner;

class Array
{
	public static void main(String arg[])
	{
		int arr[];                    // 1
		arr = new int[5];

		int brr[] = new int[5];       // 2

		int crr[] = {10,20,30,40};    // 3

		System.out.println("size of crr is : "+ crr.length);
		System.out.println("size of crr is : "+ brr.length);

		for(int i = 0; i < crr.length; i++)
		{
			System.out.println(crr[i]);
		}

	}
}