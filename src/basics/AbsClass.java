package basics;

abstract class AbsClass {

	public static void main(String[] args) {
		msgg1();
	}
	
	abstract void msgd();
	
	public static void msgg1() {
		System.out.println("Static method from Abstract Class");
	}
	public void msgg() {
		System.out.println("From Abstract Class");
	}


}
