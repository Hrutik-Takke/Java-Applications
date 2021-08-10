
/////////////////////////////////////////////////////////////////////////////////
//  
//  Function Name : main()
//  Input: string
//  Output: string
//  Description : A program to take input and Display that String.
//  Date: 10/08/2021
//  Author: Hrutik Takke
//
///////////////////////////////////////////////////////////////////////////////
  
import java.util.*;

class Program204
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string");
		
		String str = sobj.nextLine();
		
		System.out.println("Entered string is : "+str);
	}
}