package usingthis;

public class This {
	int x=20;
	public static void main(String[] args) {
		
		This ut=new This();
		ut.setData(10);
		ut.getData();

	}
	public void setData(int x)
	{
		this.x=x;
		System.out.println(x);
	}
	public void getData()
	{
		
		System.out.println(x);
	}

}

	
	
	

