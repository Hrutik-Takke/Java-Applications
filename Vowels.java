///////////////////////////////////////////////////////////
//
//  Function : Main()
//  Input : HrutikTakke
//  Output : Removing Vowels from The String [HrutikTakke]
//           All Vowels Removed Successfully..!!
//           Now the String is HrtkTkk
//  Description : Remove vowels from the String.
//  Date : 27/08/2021
//  Author Name : Hritik Takke
//
//////////////////////////////////////////////////////////

package shubham;


import java.util.Scanner;

public class Vowels
{
	
  public static void main(String args[])
  {
	String strOrig, strNew;
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter a String : ");
	strOrig = scan.nextLine();

	System.out.print("Removing Vowels from The String [" +strOrig+ "]\n");
	strNew = strOrig.replaceAll("[aeiouAEIOU]", "");

	System.out.print("All Vowels Removed Successfully..!!\nNow the String is :\n");
      
	System.out.print(strNew);
  }
}