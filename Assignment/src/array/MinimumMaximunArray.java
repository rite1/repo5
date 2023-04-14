package array;

public class MinimumMaximunArray {

	public static void main(String[] args) {
		int arr[]= {22,33,4,55,6,12,23};
		
		System.out.print("{");	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(+arr[i]+",");
		}
		System.out.println("}");
		int big=arr[0];
		for(int k=0;k<arr.length;k++)
		{
			
				if(big<arr[k])
				{
					big=arr[k];
					
				}
				
			
			
			
		}
		
		System.out.println("maximum number is "+big);
		
		int min=arr[0];
		
		for(int h=0;h<arr.length;h++)
		{
			
				if(min>arr[h])
				{
					min=arr[h];
					
				}
				
			
			
			
		}
		
		System.out.println("minimum number is "+min);
		
	}

}
