////////////////////////////////////////////////////////
//
//  Function Name : Demo
//  Input : --
//  Output : values of X:
//  Description : Uses of this keyword.
//  Date : 26/08/2021
//  Author: Hritik Takke
//
///////////////////////////////////////////////////////

//Uses of this Keyword
class Demo
{
	public int x,y;

	public Demo(int a,int b)
	{
	System.out.println("Inside parameterized Constructor");
	this.x=a;
	this.y=b;
	}

public void Fun()
 {
   System.out.println("Value of x is: "+this.x);
 }
}

 class This
 {
 	public static void main(String[] args)
 	 {
 		Demo obj=new Demo(50,100);
 		obj.Fun();
 	}
 }