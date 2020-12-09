package sampleprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

class Link3 {

	public static void main(String[] args) {
//		sortList();
		dateFunctions();
//		loopTest();
//		catchE();
		print();
	}

	public static void sortList() {
		ArrayList names = new ArrayList<>(Arrays.asList("Hell","Jeikk","Kihh"));
		//Collections.sort(names);
		//System.out.println(names);
		//names.sort(Comparator.comparing(String::toString));
		//names.sort(List.DESCENDING);
		names.stream().sorted((s1, s2) -> ((String) s1).compareTo((String) s2)).collect(Collectors.toList());
		System.out.println(names);
	}
	public static void dateFunctions() {
//		Date time = Calendar.getInstance().getTime(); 
		Date time = new Date(System.currentTimeMillis());
		System.out.println(time);
	}
	public static void loopTest() {
		for (int i=0; i<10; i=i++){
            i+=1;
            System.out.println("Hello World!- " +i);
        }
	}
	static void catchE() throws ArithmeticException {
		try{
		    System.out.print("Hello World");
		}catch(Exception e){
		    System.out.println("e");
		}finally{
		    System.out.println("!");
		}
	}
	static void print() {
		 String message = "Hello";
	       for (int i = 0; i<message.length(); i++){
	          System.out.print(message.charAt(i+1));
	       }
	    }
}


