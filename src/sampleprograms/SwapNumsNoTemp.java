package sampleprograms;

public class SwapNumsNoTemp {

	public static void main(String[] args) {
		int a =10;
		int b =13;
		swapNum(a, b);
	}

	private static void swapNum(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
