package array;

import java.util.Scanner;

public class InsertInArray {

	public static void main(String[] args) {
		
int arr[]= {22,33,4,55,6,12,23,0};
		
		System.out.print("{");	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(+arr[i]+",");
		}
		System.out.println("}");
		System.out.println("Enter any array. to Insert");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		
		System.out.println("Enter position for an array to Insert");
		Scanner s1=new Scanner(System.in);
		int pos=s1.nextInt();
		int end=arr.length;
		for(int z=arr.length-1;z>pos;z--)
		{
			arr[z]=arr[z-1];
		}
		arr[pos]=i;
		
		System.out.print("{");	
		for(int y=0;y<arr.length;y++)
		{
			System.out.print(+arr[y]+",");
		}
		System.out.println("}");

	}

}
