///////////////////////////////////////////////////////////
//
// Function Name : WordCount()
// Description   : To Count no of words in a String(using seprate function and class).
// Input         : Hello i am hrutik
// Output        : 4
// Author        : Hrutik Takke
// Date          : 16/08/2021
//
//////////////////////////////////////////////////////////
import java.util.*;

class Demo
{
	public int WordCount(String str)
	{
		String temp = str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[] = temp.split(" ");
		return Arr.length;
	}
}

class Program230
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		Demo dobj = new Demo();
		int ret = dobj.WordCount(str);
		System.out.println("Number of words are : "+ret);
	}
}




