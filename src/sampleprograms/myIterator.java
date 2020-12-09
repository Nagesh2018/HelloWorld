package sampleprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class myIterator {

	public static void main(String[] args) {
//		fromIterator();
		fromEnumerator();
	}

	private static void fromEnumerator() {
		List<Integer> myLst = new ArrayList<Integer>(Arrays.asList(4,3,5,7,9,12,46));
		Enumeration<Integer> e = Collections.enumeration(myLst);
		while (e.hasMoreElements()) {
		    Integer param = e.nextElement();
		    System.out.print(param);
		}
	}

	private static void fromIterator() {
		List<Integer> myLst = new ArrayList<Integer>(Arrays.asList(4,3,5,7,9,12,46));
		Iterator it =  myLst.iterator();
		while (it.hasNext()) {
			Object ele = it.next();
			System.out.print(ele);
		}
	}

}
