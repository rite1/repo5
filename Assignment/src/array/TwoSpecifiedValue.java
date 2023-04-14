package array;

public class TwoSpecifiedValue {

	public static void main(String[] args) {
		int arr[]= {22,33,4,55,6,12,23};
		int brr[]= {12,23};
		System.out.print("{");	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(+arr[i]+",");
		}
		System.out.print("}");
	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<brr.length;j++)
			{
				if(arr[i]==brr[j])
				{
					System.out.println("contains : "+arr[i]);
				}
			}
		}

}
}
