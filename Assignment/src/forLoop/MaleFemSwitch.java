package forLoop;

import java.util.Scanner;

public class MaleFemSwitch {

	public static void main(String[] args) {
		System.out.println("Enter M or F");
		Scanner s=new Scanner(System.in);
		String i=s.next();
		switch (i)
		{
			
		case "M":
				System.out.println("male.");
				break;
		case "F":
				System.out.println("female.");
				break;
				
		case "m":
			System.out.println("male.");
			break;
	case "f":
			System.out.println("female.");
		}
			
		

	}

}
