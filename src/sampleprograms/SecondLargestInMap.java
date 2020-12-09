package sampleprograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SecondLargestInMap {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Delhi", 2467);
		hm.put("Mumbai", 4763);
		hm.put("Bangalore", 4834);
		hm.put("ABN", 4565);
		hm.forEach((key,value)-> System.out.println(key + " " + value));
		
		int large = Collections.max(hm.values());
		int secLarge = Collections.min(hm.values());
		String secLa ="";
		
		for(Map.Entry<String, Integer> mp : hm.entrySet()) {
			if (mp.getValue()<large && mp.getValue()>secLarge) {
				secLarge = mp.getValue();
				secLa = mp.getKey();
			}
		}
		System.out.println(secLa + "-" + secLarge);
		}
		

}
