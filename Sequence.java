

////////////////////////////////////////////////////////////////////////////////////////
//
//  class Name : Sequence
//  Input :
//  Output :
//  Description : Code gets execute in sequencial formate.
//  Date : 17/09/2021
//  Author Name : Hritik Takke
//
////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.Scanner;

class Sequence
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		float radius = sobj.nextFloat();

		float area = 3.14f * radius * radius;
        float circumfarance = 2 * 3.14f * radius;

        System.out.println("Area of circle is :"+area);
        System.out.println("circumfarance of circle is :"+ circumfarance);
	}
}