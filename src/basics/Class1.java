package basics;

public class Class1 extends AbsClass {

	public static void main(String[] args) {
		AbsClass.main(args);
	}

	@Override
	void msgd() {
		System.out.println("Implemented Class");		
		
	}

	public static void stmsg() {
		System.out.println("static method Implemented Class");		
	}

}
