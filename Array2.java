

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : main
//  Input : int
//  Output :
//  Description : Accept N numbers from user and display the elements of addition. 
//  Date : 17/09/2021
//  Author Name : Hritik Takke
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
import java.lang.*;
import java.util.Scanner;

class Array2
{
	public static void main(String xyz[])
	{
		int Sum = 0;
		Scanner obj1 = new Scanner(System.in);

		System.out.println("Enter the number of element ");
		int iSize = obj1.nextInt();

		int Arr[];
		Arr = new int[iSize];
		for(int i = 0; i<Arr.length; i++)
		{
			Arr[i] = obj1.nextInt();
		}

		for(int i = 0; i<Arr.length; i++)
		{
			Sum = Sum + Arr[i];
		}
		System.out.println("Addition of all elements is :"+Sum);
	}
}