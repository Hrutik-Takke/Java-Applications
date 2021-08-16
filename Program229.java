//////////////////////////////////////////////////////////////////
//
//  Function Name : main()
//  Description   : Removing extra white spaces from a String.
//  Input         :    Hello     i    am     Hrutik
//  Output        : Hello i am shiva
//  Author        : Hrutik Takke
//  Date          : 16/08/2021
//
////////////////////////////////////////////////////////////////
import java.util.*;

class Program229
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		System.out.println("String length is : "+str.length());
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		System.out.println("New string length after removing extra white spaces : "+temp.length());
		System.out.println("Modified string is : "+temp);
	}
}




