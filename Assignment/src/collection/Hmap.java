package collection;

import java.util.HashMap;

public class Hmap {
  public static void main(String[] args) {
    HashMap<Object, Object> hm = new HashMap<>();
    hm.put(Integer.valueOf(1), "suresh");
    hm.put(Integer.valueOf(2), "ramesh");
    hm.put(Integer.valueOf(3), "ramesh");
    System.out.println(hm);
    HashMap<Object, Object> hmclone = new HashMap<>();
    hmclone.putAll(hm);
    System.out.println("New Clone HashMap:" + hmclone);
    System.out.println("Size Of The Map  " + hm.size());
    System.out.println("Empty or Not:" + hm.isEmpty());
    System.out.println("Getting value of a key 2: " + hm.get(Integer.valueOf(2)));
    System.out.println("Checking Value 'ramesh' Contains Or not:" + hm.containsValue("ramesh"));
    System.out.println(hm.containsKey(Integer.valueOf(2)));
    System.out.println("All Keys Of HashMap : " + hm.keySet());
    hm.remove(Integer.valueOf(1));
    System.out.println("After removing key 1:" + hm);
    hm.replace(Integer.valueOf(2), "rakesh");
    System.out.println("  After replacing values  " + hm);
    Object ob = hm.clone();
    HashMap hm3 = (HashMap)ob;
    System.out.print("After cloning:" + hm3);
  }
}

