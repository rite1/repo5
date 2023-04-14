package forLoop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Enter any no.");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		s.close();
		int orig=i;
		int cube=0;
		while(i>0)
		{
			int reminder=i%10;
			cube=cube+(reminder*reminder*reminder);
			i=i/10;
			
		}
		if(orig==cube)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not an Armstrong");
		}

	}

}
