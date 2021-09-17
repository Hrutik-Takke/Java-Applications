

////////////////////////////////////////////////////////////////////////////////////////
//
//  class Name : Selection
//  Input :
//  Output :
//  Description : Code gets execute in selection formate using if , else if, else.
//  Date : 17/09/2021
//  Author Name : Hritik Takke
//
////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Selection
{
	public static void main(String arg[])
	{
		// Sequence
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter first number ");
		int iNo1 = sobj.nextInt();
		System.out.println("Enter Second number ");
		int iNo2 = sobj.nextInt();
		System.out.println("Enter third number ");
		int iNo3 = sobj.nextInt();

		// Selection
		if((iNo1 >= iNo2) && (iNo1 >= iNo3))
		{
			System.out.println("Largest no is : "+iNo1);
		}
		else if(iNo2 >= iNo3)
		{
			System.out.println("Largest no is : "+iNo2);
		}
		else
		{
			System.out.println("Largest no is : "+iNo3);
		}

	}
}