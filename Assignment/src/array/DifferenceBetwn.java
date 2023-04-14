package array;

public class DifferenceBetwn {

	
		public static void main(String[] args) {
			int sec=0;
			int arr[]= {10,33,4,55,6,12,23};
			int temp=0;
			int small=0;
			for(int j=0;j<arr.length;j++)
			{	
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[j]>arr[k])
					{
						temp=arr[j];
						arr[j]=arr[k];
						arr[k]=temp;
						
						 
						
					}
				}

			}
			for(int j=0;j<arr.length;j++)
			{	
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[j]<arr[k])
					{
						small=arr[j];
						arr[j]=arr[k];
						arr[k]=small;
						
						 
						
					}
				}

			}
			System.out.println(" largest no is:"+temp);
			System.out.println(" smallest no is:"+small);
			System.out.println(" Difference btwn both are:"+(temp-small));
			
		}
	}


