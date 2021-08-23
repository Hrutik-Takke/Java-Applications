/////////////////////////////////////////////////////
//
//  Function name : Design
//  Description  : display below pattern.
//  Input        : Hello   
//
//  Output       : H 
//                 H e 
//                 H e l 
//                 H e l l 
//                 H e l l o 
//                 H e l l 
//                 H e l 
//                 H e l 
//                 H e 
//                 H
//  Author       : Hritik Takke
//  Date         : 23/08/2021
//
/////////////////////////////////////////////////////
import java.util.*;

class Pattern
{
	public void Design(String str)
	{
      char st[]=str.toCharArray();

      for(int i=0;i<st.length;i++)
      {
      	for(int j=0;j<=i;j++)
      	{
      		System.out.print(st[j]+"\t");
      	}
      	System.out.println();
      }

      for(int i=st.length-2;i>=0;i--)
      {
      	for(int j=0;j<=i;j++)
      	{
      		System.out.print(st[j]+"\t");
      	}
      	
      	System.out.println();
      }
	}
}

class P5
{
	public static void main(String[] args) 
	{
	   Scanner Sobj=new Scanner(System.in);

	   System.out.println("Enter the String ");
	   String str=Sobj.nextLine();

	   Pattern obj=new Pattern();
	   obj.Design(str);

	}
}