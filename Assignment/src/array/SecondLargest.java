package array;

public class SecondLargest {

	public static void main(String[] args) {
		int sec=0;
		int arr[]= {10,33,4,55,6,12,23};
		int big=arr[0];
		for(int j=0;j<arr.length;j++)
		{	
			for(int k=j+1;k<arr.length;k++)
			{
				if(big<arr[k])
				{
					sec=big;
					big=arr[k];
					
					 
					
				}
			}
		}
		
		System.out.println("second largest no is:"+sec);
		System.out.println("largest no."+big);
		
		
		
		
		
	}

}
