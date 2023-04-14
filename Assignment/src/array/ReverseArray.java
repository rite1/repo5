package array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		
		Rev r=new Rev();
		r.Reverse();

	}

}
class Rev
{
	
	int arr[]= {22,33,4,55,6,12,23};
	void Reverse()
	{
		System.out.print("{");	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(+arr[i]+",");
		}
		System.out.println("}");
		
		System.out.println("Reverse of number is");
		
		
		
		System.out.print("{");	
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(+arr[i]+",");
		}
			System.out.println("}");
	}
	
		
}