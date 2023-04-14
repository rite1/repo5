package demopackageforidentifier;

import accessModifier.*;

class ProtectedFieldChildClass {

	public static void main(String[] args) {
		
		Boy by=new Boy();
		by.start();
		
		

	}

}
class Boy extends ClassWithProtected
{
	public void start()
	{
		Boy b1=new Boy();
		b1.prot();
	}
}
