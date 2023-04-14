package String;
class StringFunctions
{
	public static void main(String args[])
	{
		
		String s="johnny johnny yes papa";//literal
		String st="     HI HELLO";
		System.out.println(s.length());
		System.out.println(s.substring(5));
		System.out.println(s.indexOf("n"));
		System.out.println(s.equals(st));
		System.out.println(s.equalsIgnoreCase(st));
		System.out.println(s.startsWith("j"));
		System.out.println(s.endsWith("a"));
		System.out.println(s.compareTo(st));
		System.out.println(st.trim());//removes spaces
		System.out.println(st.replace("hi","bye"));
		System.out.println(s.split("yes"));
		int n=10;
		String num=String.valueOf(n);
		System.out.println(num);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
	}
		
		
	
}

	