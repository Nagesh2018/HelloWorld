package sampleprograms;

public class AllPalindromes {

	public static void main(String[] args) {
		String pal = "malayalam";
		if(pal.equals(new StringBuffer(pal).reverse().toString())) {
			System.out.println("Palindrome 1 is " +pal);
			getPals1(pal);
		}
		else {
			System.out.println("Given String is not a Palindrome");
		}
	}

	public void getPals(String str) {
		for(int i=1;i<=str.length()/2;i++) {
			String fwdStr = str.substring(0,i+1);
			//			System.out.println("fwd " +fwdStr);
			String revStr = str.substring(str.length()-(i+1), str.length());
			//			System.out.println("Rev " +revStr);
			StringBuffer sb = new StringBuffer(revStr);
			if(fwdStr.equals(sb.reverse().toString())) {
				System.out.println("Palindrome "+(i+1) + " is " +fwdStr);
			}
		}
	}

	public static void getPals1(String str) {
		for(int i=2;i<=str.length()/2+1;i++) {
			String fwdStr = str.substring(0,i);
			String revStr = str.substring(str.length()-i);
			StringBuffer sb = new StringBuffer(revStr);
			if(fwdStr.equals(sb.reverse().toString())) {
				System.out.println("Palindrome "+i + " is " +fwdStr);
			}
		}
	}

}
