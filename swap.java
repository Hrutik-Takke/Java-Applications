/////////////////////////////////////////////////
//
//  Function Name : main
//  Description :  Swap The Two Numbers
//  Date :  30/08/2021
//  Author  : Hritik Takke
//
////////////////////////////////////////////////

// write a program to take 2 numbers as command line arguments nd swap them by using 3rd variable

class Swap
{
    public static void main(String args[])
    {
        float i, j, temp;
        int count;
        count = args.length;
        System.out.println(count);

        i = Float.parseFloat(args[0]);
        j = Float.parseFloat(args[1]);

        temp = i;
        i = j;
        j = temp;
        System.out.println("The Swapped Values Are "+i+" "+j);
    }
}