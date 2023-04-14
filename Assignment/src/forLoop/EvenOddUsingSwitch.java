package forLoop;

import java.util.Scanner;

public class EvenOddUsingSwitch {

	public static void main(String[] args) {
		
		System.out.println("Enter 1 or 2");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		switch (i)
		{
			case 1:
				System.out.println("even.");
				break;
			case 2:
				System.out.println("odd.");
		}
			
		
	}

}
