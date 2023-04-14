package array;

import java.util.Scanner;

public class ArraySpecific {

	public static void main(String[] args) {
		int arr[]= {22,33,4,55,6,12,23};
		
		System.out.print("{");	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(+arr[i]+",");
		}
		System.out.println("}");
		System.out.println("Enter any array. to search");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		s.close();
		for(int j=0;j<arr.length;j++)
		{
			if(i==arr[j])
			{
				System.out.println("value is present");
			}
			else
			{
				System.out.println("value is not present");
				break;
			}
		}
		}

}
