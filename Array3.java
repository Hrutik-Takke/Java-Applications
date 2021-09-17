

////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Input : int
//  Output :
//  Description : Traversal of 2-D Array. 
//  Date : 17/09/2021
//  Author Name : Hritik Takke
//
//////////////////////////////////////////////////////////////////////////////////////// 

import java.lang.*;
import java.util.*;

class Array3
{
   public static void main(String Abc[])
   {
   	 int Arr[][] = {{1,2,3},{4,5,6,1},{7,8,9}};
   	 int i = 0, j = 0;

   	 for(i = 0; i<Arr.length; i++)
   	 {
   	 	for(j = 0; j< Arr[i].length; j++)
   	 	{
   	 		System.out.println(Arr[i][j]);
   	 	}
   	 	System.out.println();
   	 }
   }
}