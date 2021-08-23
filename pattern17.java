/////////////////////////////////////////////////////
//
//  Function name: Design
//  Description  : display below pattern.
//  Input        : Hello   
//
//  Output       : H e l l o 
//                 H e l l * 
//                 H e l * * 
//                 H e * * * 
//                 H * * * * 
//                 H e * * * 
//                 H e l * * 
//                 H e l l * 
//                 H e l l o
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

      for(int i=st.length-1;i>=0;i--)
      {
      	for(int j=0;j<st.length;j++)
      	{
      		if(j<=i)
      		{
      			System.out.print(st[j]+"\t");
      		}
      		else
      		{
      			System.out.print("*\t");
      		}
      	}
      	System.out.println();
      }

      for(int i=1;i<st.length;i++)
      {
      	for(int j=0;j<st.length;j++)
      	{
      		if(j<=i)
      		{
      			System.out.print(st[j]+"\t");
      		}
      		else
      		{
      			System.out.print("*\t");
      		}
      	}
      	System.out.println();
      }
	}
}

class P4
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