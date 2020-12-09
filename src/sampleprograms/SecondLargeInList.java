package sampleprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class SecondLargeInList {

	public static void main(String[] args) {
		get2ndLargest();
		//		ArrayList<Integer> al= new ArrayList<>(Arrays.asList(10,40,50,50));
		//		System.out.println(al);
		//		Collections.sort(al);
		//		System.out.println(al.remove(Collections.max(al)));
		//		System.out.println(Collections.max(al));
	}
	//Second Largest
	public static void get2ndLargest() {
		ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(4,2,1,5,6,7));
		Object myarr[] = al1.toArray();
		System.out.println(myarr[myarr.length-2]);

	}
}
