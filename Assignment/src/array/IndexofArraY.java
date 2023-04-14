package array;

import java.util.Scanner;

public class IndexofArraY {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println("Enter a value to Search index");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		for(int j=0;j<=4;j++)
		{	
			
			
			if(a[j]==i)
			{
				System.out.println("Index of "+i+" is " +j);
				
			}
		
		}
		
		
		

	}

}

