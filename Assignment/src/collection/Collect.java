package collection;

import java.util.ArrayList;
import java.util.Iterator;
public class Collect {

	public static void main(String[] args) {
		

		
		    ArrayList<String> al = new ArrayList<>(10);
		    al.add("A");
		    al.add("B");
		    al.add("C");
		    al.add("D");
		    al.add("E");
		    al.add("F");
		    al.add("G");
		    al.add("H");
		    al.add("I");
		    al.add("J");
		    System.out.println(al);
		    int z = al.size();
		    System.out.println("Size:  " + z);
		    int x = 10;
		    Iterator<String> it = al.iterator();
		    while (it.hasNext())
		      System.out.println(it.next()); 
		    al.add(8, "II");
		    System.out.println(al);
		    al.remove(8);
		    System.out.println(al);
		    al.set(2, "CCC");
		    System.out.println(al);
		    System.out.println(al.get(0));
		    System.out.println(al.contains("G"));
		    al.removeAll(al);
		    System.out.println("After Removing:-" + al);
		  }
		


	}


