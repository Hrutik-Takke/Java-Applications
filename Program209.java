
/////////////////////////////////////////////////////////////////////////////////
//  
//  Function Name : CheckAnagram()
//  Input: string, string
//  Output: boolean
//  Description : Accept a two strings from user and Check The Strings is anagram or not(Using only 2 loop) &(Using + and - operator).
//  Date: 11/08/2021
//  Author: Hrutik Takke
//
///////////////////////////////////////////////////////////////////////////////

/*
	"abcde"	"cebad"
	"hello"	"loleh"
	"india"	"iinda"
*/
import java.util.*;

class StringX
{
	boolean CheckAnagram(String str1, String str2)
	{
		int i = 0;
		int count[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

		if(str1.length() != str2.length())
		{
			return false;
		}
		char arr[] = str1.toCharArray();
		char brr[] = str2.toCharArray();

		for(i = 0 ;i < arr.length; i++)
		{
			count[arr[i]-'a']++;		// count1[98 - 97]++	count1[1]++
			count[brr[i]-'a']--;
		}
		for(i = 0; i < 26;i++)
		{
			if(count[i] != 0)
			{
				break;
			}
		}	
		if(i == 26)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Program209
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Please enter first string");
		String str1 = sobj.nextLine();
		System.out.println("Please enter second string");
		String str2 = sobj.nextLine();
		StringX obj = new StringX();
		boolean bRet = obj.CheckAnagram(str1,str2);
		if(bRet == true)
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");		
	}
}