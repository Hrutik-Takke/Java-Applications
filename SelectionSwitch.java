

////////////////////////////////////////////////////////////////////////////////////////
//
//  class Name : SelectionSwitch
//  Input :
//  Output :
//  Description : Code gets execute in selection formate using switch case.
//  Date : 17/09/2021
//  Author Name : Hritik Takke
//
////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class SelectionSwitch
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter your standard");
		int Standard;
		Standard = sobj.nextInt();

		switch(Standard)
		{
			case 7 : System.out.println("Your exam is at 9Am");
					 break;
		    case 8 : System.out.println("Your exam is at 10Am");
					 break;		
			case 9 : System.out.println("Your exam is at 11Am");
					 break;
		    case 10 : System.out.println("Your exam is at 12Am");
					 break;	  
			default : System.out.println("Your entered standard is wrong");
		}
	}
}