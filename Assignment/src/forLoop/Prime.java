package forLoop;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.println("Enter any No.");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		if(i%2==0 && i%i==0)
		{
			System.out.println("Prime No.");
		}
		else
		{
			System.out.println("Not Prime");
		}

	}

}
