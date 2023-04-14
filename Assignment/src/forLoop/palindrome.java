package forLoop;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("Enter any No.");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int org_num=i;
		int rev1=0;
		while(i!=0) 
		{
		
			
			rev1=rev1*10+i%10;
			i=i/10;
		}
		
		if(org_num==rev1)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}		

}
