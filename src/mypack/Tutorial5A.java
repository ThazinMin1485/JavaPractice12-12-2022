package mypack;

import java.util.HashMap;
import java.util.Map;

public class Tutorial5A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.putAll(hm);
		System.out.println("After copy:");
		System.out.println(map);
		System.out.println("If map contains key 3 " + map.containsKey(3));
		System.out.println("If map contains key 5 " + map.containsKey(5));
	}

}
