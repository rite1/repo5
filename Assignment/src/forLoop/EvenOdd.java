package forLoop;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter any No.");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		if(i%2==0)
		{
			
				System.out.println("This is Even No.");
		}
		else
		{
			
				System.out.println("This is Odd No.");
			
		}
	}

}
