package sampleprograms;

public class ReplaceChars {

	public static void main(String[] args) {
		String str = "Hello World";
		String newStr ="";
		for(int i=0;i<=str.length()-1;i++) {
			char j = str.charAt(i);
			if (str.charAt(i)!=' ') {
				j++;
			}
			newStr = newStr + j;
		}
		System.out.println(newStr);
	}
}
