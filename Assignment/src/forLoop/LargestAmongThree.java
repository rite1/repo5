package forLoop;

import java.util.Scanner;

class LargestAmongThree
{
	public static void main(String[] args) {
		System.out.println("Enter any 1st no.");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		s.close();
		System.out.println("Enter 2nd no.");
		Scanner s1=new Scanner(System.in);
		int i1=s1.nextInt();
		System.out.println("Enter any 1st no.");
		Scanner s2=new Scanner(System.in);
		int i2=s2.nextInt();
		if(i>i1&&i>i2)
		{
			
				System.out.println(i+"This is greatest no.");
		}
		else
			if(i1>i2&&i1>i)
			{
			
				System.out.println(i1+"This is greatest no.");
			
			}
			else
			{
				System.out.println(i2+"is greatest no.");
			}
	}
}
