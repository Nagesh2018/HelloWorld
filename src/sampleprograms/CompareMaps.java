package sampleprograms;

import java.util.ArrayList;
import java.util.HashMap;

public class CompareMaps {

	public static void main(String[] args) {
		if (compareMaps()) {
			System.out.println("They are same");
		}
	}

	private static boolean compareMaps() {
		HashMap<String, String> countryCaps1 = new HashMap<String, String>();
		HashMap<String, String> countryCaps2 = new HashMap<String, String>();
		
		countryCaps1.put("Japan", "Tokyo");
		countryCaps1.put("India", "Delhi");
		countryCaps1.put("Iran", "Tehran");

		countryCaps2.put("Japan", "Tokyo");
		countryCaps2.put("India", "Delhi");
		countryCaps2.put("Iran", "Tehran");

	    System.out.println(countryCaps1.keySet().equals(countryCaps2.keySet()));  //true
	    ArrayList<String> list1Keys = new ArrayList<>(countryCaps1.keySet());
	    ArrayList<String> list1Values = new ArrayList<>(countryCaps1.values());

	    ArrayList<String> list2Keys = new ArrayList<>(countryCaps2.keySet());
	    ArrayList<String> list2Values = new ArrayList<>(countryCaps2.values());
	    
	    System.out.println(list1Keys.equals(list2Keys));
	    System.out.println(list1Values.equals(list2Values));

	    
		if(countryCaps1.equals(countryCaps2)) {
			return true;
		}
		else {
			return false;
		}

	}

}
