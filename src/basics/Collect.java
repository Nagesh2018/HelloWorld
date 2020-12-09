package basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Collect {

	public static void main(String[] args) {
		//		test();
		//		al();
		//		mp();
		linkedmp();
	}
	public static void test() {
		//		Collection<String> coll = new TreeSet();
		TreeSet<String> coll = new TreeSet<String>();
		coll.add("Z");
		coll.add("A");
		coll.add("X");
		System.out.println(coll);
	}
	public static void getList() {
		List<String> ls = new ArrayList<String>();
		ls.add("AD");
		ls.add("SF");
		System.out.println(ls);
	}	
	public static void al() {
		String[] st = {"ad","ds","dg","dfg"};
		for (String s: st) {
			System.out.println(s);
		}
	}
	public static void mp() {
		String str = "geeksforgeeks";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if (hm.get(str.charAt(i))!=null) {
				int val = hm.get(str.charAt(i));
				hm.put(str.charAt(i), val+1);
			}
			else {
				hm.put(str.charAt(i), 1);
			}
		}

		for(Entry<Character, Integer> en: hm.entrySet() ) {
			System.out.println(en);
		}

	}

	public static void linkedmp() {
		String str = "geeksforgeeks";
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if (hm.get(str.charAt(i))!=null) {
				int val = hm.get(str.charAt(i));
				hm.put(str.charAt(i), val+1);
			}
			else {
				hm.put(str.charAt(i), 1);
			}
		}
//		for(Entry<Character, Integer> en: hm.entrySet() ) {
//			System.out.println(en);
//		}
		hm.forEach((key,value)-> System.out.println(key + "--> " + value));
	}
}