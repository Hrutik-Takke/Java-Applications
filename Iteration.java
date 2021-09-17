

////////////////////////////////////////////////////////////////////////////////////////
//
//  class Name : Iteration
//  Input :
//  Output :
//  Description : Code gets execute in Iteration formate using for, while, do-while loops.
//  Date : 17/09/2021
//  Author Name : Hritik Takke
//
////////////////////////////////////////////////////////////////////////////////////////
import java.lang.*;
import java.util.Scanner;

class Iteration
{
	public static void main(String Abc[])
	{
		int i = 0;
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the number ");
		int No = obj1.nextInt();

		// For Loop
		for(i = 1; i <= No; i++)
		{
			System.out.println(i);
		}
		i = 0;
		while(i <= No)
		{
			i++;
			System.out.println(i);
		}
		i = 0;
		do
		{
			i++;
			System.out.println(i);
		}while(i < No);
	}
}