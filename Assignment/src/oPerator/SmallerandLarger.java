package oPerator;

import java.util.Scanner;

public class SmallerandLarger {

	public static void main(String[] args) {
		System.out.println("Enter any No.");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		System.out.println("Enter any No.");
		Scanner sr=new Scanner(System.in);
		int j=sr.nextInt();
		
		if(i>j)
			System.out.println(i+ " is greater and "+ j+" is smaller");
		if(i<j)
			System.out.println(j+ " is greater and "+ i+" is smaller");
	}

}
