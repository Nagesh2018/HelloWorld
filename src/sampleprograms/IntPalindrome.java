package sampleprograms;

public class IntPalindrome {

	public static void main(String[] args) {
		int pal = 202;
//		checkintPal(pal);
		checkPal(pal);
		IntPalindrome ip = new IntPalindrome();
		System.out.println(ip.hashCode());
		IntPalindrome ip1 = new IntPalindrome();
		System.out.println(ip1.hashCode());
		IntPalindrome ip2 = new IntPalindrome();
		System.out.println(ip2.hashCode());
	}

	private static void checkintPal(int pal) {
		int sum = 0, rem;
		int temp = pal;
		
		while(temp>0) {
			rem = temp%10;
			sum = sum*10+rem;
			temp = temp/10;
		}
		if (sum==pal) {
			System.out.println(sum +" is Palindrome");
		}

	}

	public static void checkPal(int inn) {
		int temp = inn;
		int sum =0; 
		int rem;
		
		while(temp>0) {
			rem = temp%10;
			sum = sum*10+rem;
			temp=temp/10;
		}
		if (sum == inn) {
			System.out.println("Palindrome");
		}
	}
}
