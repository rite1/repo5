package array;

import java.util.Scanner;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		for(int z=0;z<=4;z++)
		{
			System.out.print(ar[z]+",");
		}
		
		System.out.println("Enter A value to delete in array ");
		Scanner s=new Scanner(System.in);
		int value=s.nextInt();
		for(int i=0;i<5;i++)
		{
			if(ar[i]==value)
			{
				for(int j=i;j<4;j++)
				{
					ar[j]=ar[j+1];
				}
				
			}
			
		}
		for(int z=0;z<4;z++)
		{
			System.out.print(ar[z]+",");
		}
	}

}
