package mypack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HahMapAndHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("Initial map :" + map);
		map.put(1,"Apple");
		map.put(2, "Orange");
		map.put(3, "WaterMelon");
		map.put(4, "Banana");
		System.out.println("After Invoking put method:");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		map.remove(4);
		System.out.println("After Invoking remove method:");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		map.putIfAbsent(4, "Grape");
		System.out.println("After Invoking putIfAbsent method:" + map);
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(5, "Avocada");
		map.putAll(hm);
		System.out.println("After Invoking putAll method:" + map);
		map.replace(3, "jMango");
		System.out.println("After Invoking putAll method:" + map);
		map.replaceAll((k,v)->"Apple");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		HashSet<Integer> hs=new HashSet();
		System.out.println("Initial set :" + hs);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		Iterator<Integer> i=hs.iterator();
	    while(i.hasNext()) {
	    	System.out.println(i.next());
	    }
	    HashSet<String> set=new HashSet();
	    set.add("A");
	    set.add("B");
	    set.add("C");
	    Iterator<String> itr=set.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    set.add("A");
	    System.out.println("Updated Set" + set);
	    ArrayList<String> list=new ArrayList<String>();
	    list.add("D");
	    list.add("E");
	    set.addAll(list);
	    System.out.println("Updated Set" + set);
	    set.removeAll(list);
	    System.out.println("Updated Set" + set);
	}

}
