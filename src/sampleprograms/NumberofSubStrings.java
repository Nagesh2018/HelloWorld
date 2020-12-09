package sampleprograms;

public class NumberofSubStrings {

	public static void main(String[] args) {
		String s="mr raghu ne raghu se kaha ki raghu nahi aayega";
		getSubStrCount(s);
		getSubStrCount1(s);
	}


	private static void getSubStrCount1(String s) {
		String[] str = s.split(" ");
		int count=0;
		for (int i=0;i<=str.length-1;i++) {
			if (str[i].equals("raghu")) {
				count++;
			}
		}
		System.out.println(count);
	}


	private static void getSubStrCount(String s) {
		String[] str = s.split("raghu");
		System.out.println(str.length-1);
		for (String st: str) {
			System.out.println(st);
		}
	}
}
