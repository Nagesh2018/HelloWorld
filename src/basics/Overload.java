package basics;

public class Overload {

	public static void main(String[] args) {
		System.out.println(getStr("anc", 2));

	}

	public static String getStr(String str1, int intt) {
		String modS = str1+intt;		
		return modS;
	}
	
	public static String getStr(String str1) {
		String modS = str1+"8";
		return modS;
	}
	
}
