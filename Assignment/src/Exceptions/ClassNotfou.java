package Exceptions;

public class ClassNotfou {

	public static void main(String[] args) {
		try {
			Class.forName("hi");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
