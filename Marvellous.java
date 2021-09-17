
/////////////////////////////////////////////////////
//
//  Function Name : Addition, Substraction
//  Input :
//  Output : int
//  Description : Constructor in java.
//  Date : 17/09/2021
//  Author Name : Hritik Takke
//
////////////////////////////////////////////////////
import java.lang.*;

class Arithematic 
{
	public int No1, No2;

	public Arithematic()
	{
		System.out.println("Default Constructor");
		No1 = 0;
		No2 = 0;
	}
	public Arithematic(int x, int y)
	{
		System.out.println("Parametrised Constructor");
		No1 = x;
		No2 = y;
	}

	int Addition()
	{
		int Ans = 0;
		Ans = No1 + No2;
		return Ans;
	}
	int Substraction()          // Non static method
	{
		int Ans = 0;
		Ans = No1 - No2;
		return Ans;
	}
}
class Marvellous
{
	public static void main(String xyz[])
	{
		Arithematic obj1 = new Arithematic();
 		Arithematic obj2 = new Arithematic(20,30);

 		int iRet = obj2.Addition();
 		System.out.println("Addition is "+iRet);

 		iRet = obj2.Substraction();
 		System.out.println("Substraction is "+iRet);
		
	}
}




////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name : Addition, Substraction
//  Input :
//  Output : int
//  Description :  Constructor in java using Static method and static characteristics.
//  Date : 17/09/2021
//  Author Name : Hritik Takke
//
////////////////////////////////////////////////////////////////////////////////////////

import java.lang.*;

class Arithematic 
{
	public static int No1, No2;

	public Arithematic()
	{
		System.out.println("Default Constructor");
		No1 = 0;
		No2 = 0;
	}
	public Arithematic(int x, int y)
	{
		System.out.println("Parametrised Constructor");
		No1 = x;
		No2 = y;
	}

	static int Addition()        // static method
	{
		int Ans = 0;
		Ans = No1 + No2;
		return Ans;
	}
	int Substraction()          // Non static method
	{
		int Ans = 0;
		Ans = No1 - No2;
		return Ans;
	}
}
class Marvellous
{
	public static void main(String xyz[])
	{
		Arithematic obj1 = new Arithematic();
 		Arithematic obj2 = new Arithematic(20,30);

 		int iRet = Arithematic.Addition();    
 		System.out.println("Addition is "+iRet);

 		iRet = obj2.Substraction();
 		System.out.println("Substraction is "+iRet);
		
		
	}
}
