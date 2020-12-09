package sampleprograms;
import java.util.Arrays;
import java.util.stream.Stream;

public class Hello1 {

	public static void main(String[] args) {
		System.out.println("Hello");
		String[] myArray = new String[] {"bob", "alice", "paul", "ellie"};
//		Stream<String> myStream = Arrays.stream(myArray);
//		Stream<String> myNewStream = myStream.map(s -> s.toUpperCase());
//		System.out.println(myNewStream.collect(Collectors.toList()));
//		myNewStream.forEach(s -> System.out.println(s)); 
		printCaps(myArray);
	}
	
	public static void printCaps(String[] str) {
		Stream<String> strea = Arrays.stream(str);
		Stream<String> newStrea = strea.map(s -> s.toUpperCase());
		newStrea.forEach(s -> System.out.println(s));
	}

}



