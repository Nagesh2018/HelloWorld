package basics;

public class NullPointerExcp {

	static Class2 c2 = new Class2();
	
	public static String foo() {
		System.out.println("static method");
		return " ";
	}

	public static void main(String[] args) {
		NullPointerExcp np = null;
		System.out.println(np.foo());
		c2= null;
		System.out.println(c2.toString());
		
	}
}
