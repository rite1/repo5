package array;

public class DuplicateValue {

	public static void main(String[] args) {
			String arr[]= {"java","C","C++","Python","Python"};
			int t;
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						System.out.println("Duplicate Value Found");
						
						while(i<arr.length-1)
						{
								arr[i]=arr[i+1];
								i++;
						}
						arr[i]=null;
					}
				}
			}

			
			for(int h=0;h<arr.length;h++)
			{
				System.out.println(arr[h]);
			}
			
			
	}

}
