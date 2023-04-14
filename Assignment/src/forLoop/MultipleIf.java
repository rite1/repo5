package forLoop;

import java.util.Scanner;

class MultipleIf
{
	public static void main(String[] args) {
		System.out.println("Enter any 1st no.");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		System.out.println("Enter 2nd no.");
		Scanner s1=new Scanner(System.in);
		int i1=s1.nextInt();
		System.out.println("Enter any 1st no.");
		Scanner s2=new Scanner(System.in);
		int i2=s2.nextInt();
		if(i>i1)
		{
			System.out.println(i+" is greater");
		}
		if(i1>i2)
		{
			System.out.println(i1+" is greater");
		}
		if(i2>i)
		{
			System.out.println(i2+" is greater");
		}
		}
	}
