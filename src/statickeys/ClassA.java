package statickeys;

final class ClassA {
	static String str="Hello";

	public static void main(String[] args) {
		System.out.println("From Static Class");
	}
	
	static void methodA() {
		System.out.println("From Static Method");
	}
	
	static {
		System.out.println("From Static Block");
	}

	static class innerClass {
		void msg() {
			System.out.println("from inner static class");
		}
	}
}
