package array;

import java.util.Arrays;



public class AddArray {

	public static void main(String[] args) {
		Arr a1=new Arr();
		a1.addArray(50, 50);
		
	}

}
class Arr
{
	public int c[]=new int[2];
	void addArray(int a,int b)
	{
		c[0]=a;
		c[1]=b;
		int add=c[0]+c[1];
		System.out.println("Addition of array is -  " +add);
		
	}
}
