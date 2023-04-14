package accessModifier;

public class ClassToAccesDefaultAndProtected{

	public static void main(String[] args) {
		One o2=new One();
		
		String s=o2.b;
		System.out.println(s);
		o2.Defa();   //Accessing from ClassWithDefault Class in same package
		o2.Prot();		//Accessing Protected Member ClassWithDefault Class in same package
	}

}
