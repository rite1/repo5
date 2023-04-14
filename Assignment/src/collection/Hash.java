package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash {
  public static void main(String[] args) {
    HashSet<String> hs = new HashSet(10);
    hs.add("johnny");
    hs.add("johnny");
    hs.add("yes");
    hs.add("papa");
    hs.add("eating");
    hs.add("sugar");
    hs.add("no");
    hs.add("papa");
    System.out.println(hs);
    hs.remove("papa");
    System.out.println("After removing :" + hs);
    System.out.println(hs.contains(Integer.valueOf(100)));
    System.out.println(hs.isEmpty());
    Iterator<String> it = hs.iterator();
    while (it.hasNext())
      System.out.println(it.next()); 
    HashSet<String> hs1 = new HashSet();
    hs1.addAll(hs);
    System.out.println("New Hashset is :" + hs1);
    hs.removeAll(hs);
    System.out.println("Ater removing all" + hs);
    
  }
}

