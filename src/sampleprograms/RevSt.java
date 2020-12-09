package sampleprograms;

public class RevSt {

	static String myStrr = "StaticStr";
	public static void main(String[] args) {
		String str = "Nagesh";
		String newStr ="";
		for(int i=str.length()-1;i>=0;i--) {
			newStr = newStr+str.charAt(i);
		}
		System.out.println(newStr);
	}
}
