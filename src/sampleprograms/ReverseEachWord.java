package sampleprograms;

public class ReverseEachWord {

	public static void main(String[] args) {
		String sampleSent = "Hello World Works Like This";
		reverseWord(sampleSent);
		reverseWords(sampleSent);
	}

	private static void reverseWords(String sampleSent) {
		String[] words = sampleSent.split(" ");
		for (String str : words) {
			String myStr ="";
			for(int i=str.length();i>0;i--) {
				myStr = myStr + str.charAt(i-1);
			}
			System.out.println(myStr);			
		}
	}

	private static void reverseWord(String sampleSent) {
		String[] words = sampleSent.split(" ");
		for (String str : words) {
			StringBuffer sb = new StringBuffer(str);
			StringBuffer rev = sb.reverse();
			System.out.println(rev.toString());
		}
		System.out.println("****************");
	}
}
