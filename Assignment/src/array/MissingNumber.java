package array;

public class MissingNumber {

	public static void main(String[] args) {
		
		int arr[]= new int[100];
		int n=100;
		int sum=(n*(n+1))/2;
		for(int i=0;i<arr.length-1;i++)
		{	
			
			arr[i]=i+1;
		}
		System.out.print("{");
		for(int j=0;j<arr.length-1;j++)
		{
			System.out.print(arr[j]+",");
		}
		System.out.print("\n");
		
		
				
		for(int z=0;z<arr.length;z++)
		{
			
				sum=sum-arr[z];
			
		}
		System.out.print("Missing Number is : "+sum);
	}

}
