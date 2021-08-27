/////////////////////////////////////////////////////////
//
//  Function : count(String str);
//  Input : --
//  Output : Hritik ->6
//           Shubham ->7
//           Shiva ->5
//  Description : Count the length of each substring.
//  Date : 27/08/2021
//  Author Name : Hritik Takke
//
///////////////////////////////////////////////////////

package shubham;
public class CountCharacters 
{
	static void count(String str)
	{
		
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{


			String s = "";
			while (i < ch.length && ch[i] != ' ') 
			{
				s = s + ch[i];
				i++;
			}
			if(s.length()>0)
			{
				System.out.println(s + "->" + s.length());
		    }
		
	    }
		String s1="";
	}
	
	public static void main(String[] args)
	{
		String str = "shruti nahar lodha";
		count(str);
	}
}