package sampleprograms;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class PracticalIntQuestions {

	public static void main(String[] args) {
//		nullPointerExp();
//		printObj();
		checkStringMatch();
		objInit();
	}
	
	public static void objInit() {
		AllPalindromes ap = new AllPalindromes();
		ap.getPals("ddd");
	}
	public static void nullPointerExp() {
		Object a = null;
		System.out.println(a.toString());
	}

	//Print object 
	public static void printObj() {
		CompareMaps mps = new CompareMaps();
		System.out.println(mps.getClass());
	}
	
	public static void checkStringMatch() {
		char[] toChk1 = doSort("sadashiv");
		List myLst = new ArrayList<>(Arrays.asList("gugytfd","shivasda","ddwdwd","shivsada"));
		int count=0;
		for(Object obj: myLst) {
			char[] comm = doSort(obj);
			if((Arrays.equals(comm,toChk1))) {
				count++;
			}
		}
		System.out.println("matches "+ count);
	}
	
	public static char[] doSort(Object obj) {
		char[] mych = obj.toString().toCharArray();
		Arrays.sort(mych);
		System.out.println(mych);
		return mych;
	}
	
}